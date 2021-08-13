package com.suncj.task.week08.service;

import com.suncj.task.week08.entity.OrderEntity;
import com.suncj.task.week08.mapper.OrderMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderEntity> findList(Long userId,Long orderId) {
        return orderMapper.findList(userId,orderId);
    }
    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public void create(OrderEntity entity){
        orderMapper.create(entity);
    }

    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public int delete(Long userId,Long orderId){
        return orderMapper.delete(userId,orderId);
    }

    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public int update(Long userId,Long orderId){
        return orderMapper.update(userId+"ps",orderId,userId);
    }


}
