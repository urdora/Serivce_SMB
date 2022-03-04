package com.smb.application;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smb.entity.SupplierInfo;
import com.smb.service.SupplierInfoService;
import com.smb.vo.PageInfoVO;
import com.smb.vo.SupplierPageVO;
import com.smb.vo.SupplierVO;
import com.smb.vo.converter.SupplierDTO2VOConverter;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 供应商交换中心
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@Component
public class SupplierApplication {

    @Autowired
    SupplierInfoService supplierService;

    public SupplierPageVO querySupplierPage(String supplierNumber, PageInfoVO pageInfoVO) {
        Page<SupplierInfo> page = new Page<>(pageInfoVO.getPageNbr(), pageInfoVO.getPageSize());
        QueryWrapper<SupplierInfo> queryWrapper = new QueryWrapper<>();
        if (!Strings.isBlank(supplierNumber)) {
            // 根据名称或者id筛选
            queryWrapper.lambda()
                    .like(SupplierInfo::getSupplierNumber, supplierNumber)
                    .or()
                    .like(SupplierInfo::getSupplierName, supplierNumber);
        }
        Page<SupplierInfo> result = supplierService.page(page, queryWrapper);
        pageInfoVO.setTotalSize(result.getTotal());

        List<SupplierVO> supplierVOS =
                SupplierDTO2VOConverter.INSTANCE.SupplierDTO2VOs(result.getRecords());

        return SupplierPageVO.builder().pageInfo(pageInfoVO).supplierInfos(supplierVOS).build();
    }

    public SupplierVO querySupplierInfo(String supplierNumber) throws Exception {

        List<SupplierInfo> list = supplierService.list(new QueryWrapper<SupplierInfo>().lambda()
                .eq(SupplierInfo::getSupplierNumber, supplierNumber));
        if (list.size() != 1) {
            throw new Exception("查询结果大于预期结果数量: 1");
        }
        return SupplierDTO2VOConverter.INSTANCE.SupplierDTO2VO(list.get(0));
    }
}
