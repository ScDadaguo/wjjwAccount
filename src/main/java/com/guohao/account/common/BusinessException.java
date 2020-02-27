/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

package com.guohao.account.common;

import com.guohao.account.constant.ErrorCodeEnum;

/**
 * @Description: 业务异常类
 * @Author: jianpo.zhao
 * @Date: 2018/6/13 14:31
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6960555420031946358L;
    private ErrorCodeEnum codeMsg;//标准编码，用于根据编码查询错误信息

    public BusinessException() {
        super();
    }


    public BusinessException(ErrorCodeEnum codeMsg) {
        super(codeMsg.toString());
        this.codeMsg = codeMsg;
    }

    public ErrorCodeEnum getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(ErrorCodeEnum codeMsg) {
        this.codeMsg = codeMsg;
    }

    public static void businessError(ErrorCodeEnum codeMsg) {
        throw new BusinessException(codeMsg);
    }

}
