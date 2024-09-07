package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("userShopController")
@Slf4j
@RequestMapping("/user/shop")
@Api(tags = "营业相关接口")
public class ShopController {

    @Autowired
    public RedisTemplate redisTemplate;

    /**
     * 获取营业状态
     * @return
     */
    @GetMapping("/status")
    @ApiOperation("获取营业状态")
    public Result<Integer> getStatus(){
        //从redis中获取值
        Integer status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");
        log.info("设置营业状态{}",status ==1 ? "营业中" : "打样中");
        return Result.success(status);
    }
}
