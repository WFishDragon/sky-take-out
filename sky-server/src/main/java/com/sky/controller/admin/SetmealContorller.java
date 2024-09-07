package com.sky.controller.admin;

import com.sky.dto.SetmealDTO;
import com.sky.result.Result;
import com.sky.service.SetmealService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@Api(tags = "套餐管理接口")
@Slf4j
@RequestMapping("/admin/setmeal")
public class SetmealContorller {
    //注入setmealService类
    @Autowired SetmealService setmealService;

    /**
     * 修改套餐
     * @param setmealDTO
     * @return
     */
    //TODO 修改套餐未完成
    @PutMapping()
    public Result setmeal(@RequestBody SetmealDTO setmealDTO) {
        setmealService.update(setmealDTO);
        return Result.success();
    }

    /**
     * 新增套餐
     * @param setmealDTO
     * @return
     */
    @PostMapping()
    public Result addSetmeal(@RequestBody SetmealDTO setmealDTO) {
        setmealService.saveSetmeal(setmealDTO);
        return Result.success();
    }
}
