-- aj_smb.invoice_info definition

CREATE TABLE `invoice_info` (
                                `invoice_number` varchar(32) NOT NULL COMMENT '单据流水号;单据流水号',
                                `create_man` varchar(32) DEFAULT NULL COMMENT '创建人;创建人',
                                `order_number` varchar(50) DEFAULT NULL COMMENT '订单id;订单编号',
                                `supplier_number` varchar(50) DEFAULT NULL COMMENT '供应商id;供应商id',
                                `stuff_name` varchar(100) DEFAULT NULL COMMENT '用料名称;用料名称',
                                `stuff_count` varchar(10) DEFAULT NULL COMMENT '用料量;用料量',
                                `unit` varchar(10) DEFAULT NULL COMMENT '单位;单位',
                                `unit_price` decimal(24,2) DEFAULT NULL COMMENT '单价;单价',
                                `is_true` varchar(1) DEFAULT NULL COMMENT '是否已对账;是否已对账 1-是  0-否',
                                `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间;创建时间',
                                PRIMARY KEY (`invoice_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='单据表';


-- aj_smb.order_info definition

CREATE TABLE `order_info` (
                              `order_number` varchar(32) NOT NULL COMMENT '订单id;订单id',
                              `customer_name` varchar(50) DEFAULT NULL COMMENT '客户名称;客户名称',
                              `customer_contact1` varchar(50) DEFAULT NULL COMMENT '客户联系方式1;客户联系方式1',
                              `customer_contact2` varchar(50) DEFAULT NULL COMMENT '客户联系方式2;客户联系方式2',
                              `customer_contact3` varchar(50) DEFAULT NULL COMMENT '客户联系方式3;客户联系方式3',
                              `order_money` varchar(20) DEFAULT NULL COMMENT '订单金额',
                              `currency` varchar(32) DEFAULT NULL COMMENT '结算币种;结算币种',
                              `is_done` varchar(1) DEFAULT NULL COMMENT '订单是否已完成;订单是否已完成  1-done 0-no',
                              PRIMARY KEY (`order_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='订单表';


-- aj_smb.supplier_info definition

CREATE TABLE `supplier_info` (
                                 `supplier_number` varchar(32) NOT NULL COMMENT '供应商id',
                                 `supplier_name` varchar(50) DEFAULT NULL COMMENT '供应商名称',
                                 `supplier_contact1` varchar(255) DEFAULT NULL COMMENT '供应商联系方式1',
                                 `supplier_contact2` varchar(255) DEFAULT NULL COMMENT '供应商联系方式2',
                                 `supplier_contact3` varchar(255) DEFAULT NULL COMMENT '供应商联系方式3',
                                 PRIMARY KEY (`supplier_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='供应商表';