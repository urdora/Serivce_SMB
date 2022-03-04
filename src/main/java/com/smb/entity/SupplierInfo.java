package com.smb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 供应商表
 * </p>
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("supplier_info")
public class SupplierInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String supplierNumber;

    private String supplierName;

    private String supplierContact1;

    private String supplierContact2;

    private String supplierContact3;

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getSupplierContact1() {
        return supplierContact1;
    }

    public void setSupplierContact1(String supplierContact1) {
        this.supplierContact1 = supplierContact1;
    }
    public String getSupplierContact2() {
        return supplierContact2;
    }

    public void setSupplierContact2(String supplierContact2) {
        this.supplierContact2 = supplierContact2;
    }
    public String getSupplierContact3() {
        return supplierContact3;
    }

    public void setSupplierContact3(String supplierContact3) {
        this.supplierContact3 = supplierContact3;
    }

    @Override
    public String toString() {
        return "SupplierInfo{" +
            "supplierNumber=" + supplierNumber +
            ", supplierName=" + supplierName +
            ", supplierContact1=" + supplierContact1 +
            ", supplierContact2=" + supplierContact2 +
            ", supplierContact3=" + supplierContact3 +
        "}";
    }
}
