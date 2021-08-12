package com.suncj.task.week08.mapper;

import com.suncj.task.week08.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<OrderEntity> findList(@Param("userId") Long userId,@Param("orderId")Long orderId);

    void create(OrderEntity entity);

    int update(@Param("productName") String productName, @Param("orderId")Long orderId,@Param("userId")Long userId);

    int delete(@Param("userId")Long userId,@Param("orderId")Long orderId);
}
