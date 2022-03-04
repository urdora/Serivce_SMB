package com.smb.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SupplierPageVO {

    List<SupplierVO> supplierInfos;

    PageInfoVO pageInfo;
}
