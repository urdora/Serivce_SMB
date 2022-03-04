package com.smb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smb.entity.InvoiceInfo;
import com.smb.mapper.InvoiceInfoMapper;
import com.smb.service.InvoiceInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单据表 服务实现类
 * </p>
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@Service
public class InvoiceInfoServiceImpl extends ServiceImpl<InvoiceInfoMapper, InvoiceInfo> implements InvoiceInfoService {

}
