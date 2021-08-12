package com.suncj.task.week08.service;

import com.suncj.task.week08.entity.OrderEntity;
import com.suncj.task.week08.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderEntity> findList(Long userId,Long orderId) {
        return orderMapper.findList(userId,orderId);
    }

    public void create(OrderEntity entity){
        orderMapper.create(entity);
    }

    public int delete(Long userId,Long orderId){
        return orderMapper.delete(userId,orderId);
    }

    public int update(Long userId,Long orderId){
        return orderMapper.update(userId+"ps",orderId,userId);
    }


}
