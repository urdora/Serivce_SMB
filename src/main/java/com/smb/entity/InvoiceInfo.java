package com.smb.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 单据表
 * </p>
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@TableName("invoice_info")
public class InvoiceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String invoiceNumber;

    private String createMan;

    private String orderNumber;

    private String supplierNumber;

    private String stuffName;

    private String stuffCount;

    private String unit;

    private BigDecimal unitPrice;

    private String isTrue;

    private LocalDateTime createTime;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }
    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }
    public String getStuffCount() {
        return stuffCount;
    }

    public void setStuffCount(String stuffCount) {
        this.stuffCount = stuffCount;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(String isTrue) {
        this.isTrue = isTrue;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "InvoiceInfo{" +
            "invoiceNumber=" + invoiceNumber +
            ", createMan=" + createMan +
            ", orderNumber=" + orderNumber +
            ", supplierNumber=" + supplierNumber +
            ", stuffName=" + stuffName +
            ", stuffCount=" + stuffCount +
            ", unit=" + unit +
            ", unitPrice=" + unitPrice +
            ", isTrue=" + isTrue +
            ", createTime=" + createTime +
        "}";
    }
}
