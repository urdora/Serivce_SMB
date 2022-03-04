package com.framework.resultInfo;

import lombok.Data;

/**
 * 公共返回类
 */
@Data
public class ResultData {

    private String code;

    private String msg;

    private Object data;

    public static ResultData success(Object data) {
        return resultData(ResponseCodeEnum.SUCCESS.val(), ResponseCodeEnum.SUCCESS.msg(), data);
    }

    public static ResultData success(Object data, String msg) {
        return resultData(ResponseCodeEnum.SUCCESS.val(), msg, data);
    }

    public static ResultData fail(String code, String msg) {
        return resultData(code, msg, null);
    }

    public static ResultData fail(String code, String msg, Object data) {
        return resultData(code, msg, data);
    }

    private static ResultData resultData(String code, String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(code);
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }
}
