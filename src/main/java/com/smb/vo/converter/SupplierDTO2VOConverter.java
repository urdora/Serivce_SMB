package com.smb.vo.converter;

import com.smb.entity.SupplierInfo;
import com.smb.vo.SupplierVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SupplierDTO2VOConverter {

    SupplierDTO2VOConverter INSTANCE = Mappers.getMapper(SupplierDTO2VOConverter.class);

    @Mappings({
            @Mapping(source = "supplierNumber", target = "supplierNumber"),
            @Mapping(source = "supplierName", target = "supplierName"),
            @Mapping(source = "supplierContact1", target = "supplierContact1"),
            @Mapping(source = "supplierContact2", target = "supplierContact2"),
            @Mapping(source = "supplierContact3", target = "supplierContact3")
    })
    SupplierVO SupplierDTO2VO(SupplierInfo supplierInfo);

    List<SupplierVO> SupplierDTO2VOs(List<SupplierInfo> supplierInfos);
}