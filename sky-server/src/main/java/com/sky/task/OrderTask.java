package com.sky.task;

import com.sky.entity.Orders;
import com.sky.mapper.OrderMapper;
import com.sky.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@Slf4j
public class OrderTask {
    @Autowired
    private OrderMapper orderMapper;
    /**
     * 处理超时订单
     */
    @Scheduled(cron = "0 * * * * ?")    //每分钟触发一次
    public void processTimeoutOrder() {
        log.info("定时处理超时订单:{}", LocalDateTime.now());
        //查询超过15分钟还没支付完成的订单
        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);   //加上-15分钟的时间
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.PENDING_PAYMENT,time);
        if(ordersList.size() != 0 && ordersList != null) {
            for (Orders order : ordersList) {
                //修改订单状态为取消
                order.setStatus(Orders.CANCELLED);
                order.setCancelReason("订单超时，已取消");
                order.setCancelTime(LocalDateTime.now());
                orderMapper.update(order);
            }
        }
    }
    //处理一直处于派送中状态的订单
    @Scheduled(cron = "0 0 1 * * ?")    //每天凌晨1点触发一次
    public void processDelayOrder() {
        log.info("定时处理处于派送中的订单:{}", LocalDateTime.now());
        LocalDateTime time = LocalDateTime.now().plusMinutes(-60);
        //
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.DELIVERY_IN_PROGRESS,time);

        if(ordersList.size() != 0 && ordersList != null) {
            for (Orders order : ordersList) {
                //修改订单状态为已完成
                order.setStatus(Orders.COMPLETED);
                orderMapper.update(order);
            }
        }
    }
}
