package com.smb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smb.entity.OrderInfo;
import com.smb.mapper.OrderInfoMapper;
import com.smb.service.OrderInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
