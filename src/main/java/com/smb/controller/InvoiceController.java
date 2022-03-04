package com.smb.controller;

import com.framework.resultInfo.ResponseCodeEnum;
import com.framework.resultInfo.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单入口类
 *
 * @author wangyihang
 * @date 2022/1/17
 */
@Slf4j
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    /**
     * 订单列表查询
     *
     * @return
     */
    @GetMapping("/queryPage")
    public ResultData queryInvoicePage() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("订单查询: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }

    /**
     * 订单详情查询
     *
     * @return
     */
    @GetMapping("/queryInfo")
    public ResultData queryInvoiceInfo() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("订单详情查询: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }

    /**
     * 订单新增/编辑
     *
     * @return
     */
    @PostMapping("/createModify")
    public ResultData createOrModifyInvoice() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("新增/编辑: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }

    /**
     * 订单删除
     *
     * @return
     */
    @GetMapping("/remove")
    public ResultData removeInvoice() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("订单删除: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }
}
