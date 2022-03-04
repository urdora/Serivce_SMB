package com.smb.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierVO {
    private String supplierNumber;

    private String supplierName;

    private String supplierContact1;

    private String supplierContact2;

    private String supplierContact3;
}
