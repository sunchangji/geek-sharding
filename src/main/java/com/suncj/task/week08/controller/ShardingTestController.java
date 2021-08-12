package com.suncj.task.week08.controller;

import com.suncj.task.week08.entity.OrderEntity;
import com.suncj.task.week08.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("db")
public class ShardingTestController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("query")
    public List<OrderEntity> queryDb(Long userId,Long orderId){
        return orderService.findList(userId,orderId);
    }

    @RequestMapping("create")
    public boolean create(Long userId){
        OrderEntity entity = buildEntity(userId);
        orderService.create(entity);
        return true;
    }

    @RequestMapping("update")
    public int create(String productName,long orderId){
        return orderService.update(productName,orderId);
    }

    private OrderEntity buildEntity(Long userId){
        OrderEntity entity = new OrderEntity();
        entity.setOrderId(System.currentTimeMillis());
        entity.setUserId(userId);
        entity.setAverageCost(BigDecimal.valueOf(1.02));
        entity.setBuyNum(10);
        entity.setFeeMoney(BigDecimal.valueOf(0.02));
        entity.setProductId(12100L);
        entity.setProductPrice(BigDecimal.valueOf(6.02));
        entity.setProductName("测试商品");
        entity.setWarehouseId(100L);
        Date nowTime = new Date();
        entity.setCreateTime(nowTime);
        entity.setUpdateTime(nowTime);
        return entity;
    }
}
