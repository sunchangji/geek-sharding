-- ----------------------------
--  Table structure for `t_order_12`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单ID',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `product_id` bigint(20) unsigned NOT NULL COMMENT '订单商品ID',
  `product_name` varchar(50) NOT NULL COMMENT '商品名称',
  `buy_num` int(11) NOT NULL DEFAULT '1' COMMENT '购买商品数量',
  `product_price` decimal(8,2) NOT NULL COMMENT '购买商品单价',
  `average_cost` decimal(8,2) NOT NULL COMMENT '平均成本价格',
  `fee_money` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '优惠分摊金额',
  `warehouse_id` bigint(20) unsigned NOT NULL COMMENT '仓库ID',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单详情表';

SET FOREIGN_KEY_CHECKS = 1;
