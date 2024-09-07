package com.sky.service;

import com.sky.dto.SetmealDTO;
import org.springframework.stereotype.Service;

@Service
public interface SetmealService {
    /**
     * 修改套餐
     * @param setmealDTO
     */
    void update(SetmealDTO setmealDTO);

    /**
     * 新增套餐
     * @param setmealDTO
     */
    void saveSetmeal(SetmealDTO setmealDTO);
}
