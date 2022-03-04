package com.smb.controller;

import com.framework.resultInfo.ResponseCodeEnum;
import com.framework.resultInfo.ResultData;
import com.smb.application.SupplierApplication;
import com.smb.entity.SupplierInfo;
import com.smb.vo.PageInfoVO;
import com.smb.vo.SupplierPageVO;
import com.smb.vo.SupplierVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 供应商入口类
 *
 * @author wangyihang
 * @date 2022/1/17
 */
@Slf4j
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierApplication supplierApplication;

    /**
     * 供应商列表查询
     *
     * @return
     */
    @GetMapping("/queryPage")
    public ResultData querySupplierPage(@RequestParam(name = "supplierNbr", required = false) String supplierNumber,
                                        @RequestParam(name = "pageNbr") Long pageNbr, @RequestParam(name = "pageSize") Long pageSize) {
        try {
            PageInfoVO pageInfoVO = new PageInfoVO(pageNbr, pageSize, 0);
            SupplierPageVO supplierInfos =
                    supplierApplication.querySupplierPage(supplierNumber, pageInfoVO);
            return ResultData.success(supplierInfos);
        } catch (Exception e) {
            log.error("供应商查询: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }

    /**
     * 供应商详情查询
     *
     * @return
     */
    @GetMapping("/queryInfo")
    public ResultData querySupplierInfo(@RequestParam("supplierNbr") String supplierNumber) {
        try {
            SupplierVO supplierInfo = supplierApplication.querySupplierInfo(supplierNumber);
            return ResultData.success(supplierInfo);
        } catch (Exception e) {
            log.error("供应商详情查询: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查: " + e.getMessage());
        }
    }

    /**
     * 供应商新增/编辑
     *
     * @return
     */
    @PostMapping("/createModify")
    public ResultData createOrModifySupplier() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("供应商新增/编辑: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }

    /**
     * 供应商删除
     *
     * @return
     */
    @GetMapping("/remove")
    public ResultData removeSupplier() {
        try {
            return ResultData.success(null);
        } catch (Exception e) {
            log.error("供应商删除: " + e.getMessage());
            return ResultData.fail(ResponseCodeEnum.ERROR.val(), "异常请检查");
        }
    }
}
