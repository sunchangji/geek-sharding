package com.suncj.task.week08.mapper;

import com.suncj.task.week08.entity.TradeOrderDetailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TradeOrderDetailMapper {

    List<TradeOrderDetailEntity> findList();

    void create(TradeOrderDetailEntity entity);

    int update(@Param("productName") String productName, @Param("id")Long id);

    void batchCreate(List<TradeOrderDetailEntity> list);
}
