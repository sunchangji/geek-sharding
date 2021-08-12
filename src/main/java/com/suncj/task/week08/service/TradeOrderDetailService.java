package com.suncj.task.week08.service;

import com.suncj.task.week08.entity.TradeOrderDetailEntity;
import com.suncj.task.week08.mapper.TradeOrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeOrderDetailService {

    @Autowired
    private TradeOrderDetailMapper tradeOrderDetailMapper;

    public List<TradeOrderDetailEntity> findList() {
        return tradeOrderDetailMapper.findList();
    }

    public void create(TradeOrderDetailEntity entity){
        tradeOrderDetailMapper.create(entity);
    }

    public void batchCreate(List<TradeOrderDetailEntity> list){
        tradeOrderDetailMapper.batchCreate(list);
    }

    public int update(String productName,Long id){
        return tradeOrderDetailMapper.update(productName,id);
    }
}
