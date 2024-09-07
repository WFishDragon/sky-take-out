package com.sky.service.impl;

import com.sky.dto.SetmealDTO;
import com.sky.entity.Setmeal;
import com.sky.mapper.SetmealMapper;
import com.sky.service.SetmealService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired

    public SetmealMapper setmealMapper;
    /**
     * 修改套餐
     * @param setmealDTO
     */
    @Override
    public void update(SetmealDTO setmealDTO) {

    }

    /**
     * 新增套餐
     * @param setmealDTO
     */
    //开启事务管理
    @Transactional
    @Override
    public void saveSetmeal(SetmealDTO setmealDTO) {
        Setmeal setmeal = new Setmeal();
        //复制属性
        BeanUtils.copyProperties(setmealDTO, setmeal);
        //向套餐表中插入数据
        setmealMapper.insert(setmeal);
    }

}
