package com.smb.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author wangyihang
 * @since 2022-01-17
 */
@TableName("order_info")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderNumber;

    private String customerName;

    private String customerContact1;

    private String customerContact2;

    private String customerContact3;

    private String orderMoney;

    private String currency;

    private String isDone;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerContact1() {
        return customerContact1;
    }

    public void setCustomerContact1(String customerContact1) {
        this.customerContact1 = customerContact1;
    }
    public String getCustomerContact2() {
        return customerContact2;
    }

    public void setCustomerContact2(String customerContact2) {
        this.customerContact2 = customerContact2;
    }
    public String getCustomerContact3() {
        return customerContact3;
    }

    public void setCustomerContact3(String customerContact3) {
        this.customerContact3 = customerContact3;
    }
    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getIsDone() {
        return isDone;
    }

    public void setIsDone(String isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
            "orderNumber=" + orderNumber +
            ", customerName=" + customerName +
            ", customerContact1=" + customerContact1 +
            ", customerContact2=" + customerContact2 +
            ", customerContact3=" + customerContact3 +
            ", orderMoney=" + orderMoney +
            ", currency=" + currency +
            ", isDone=" + isDone +
        "}";
    }
}
