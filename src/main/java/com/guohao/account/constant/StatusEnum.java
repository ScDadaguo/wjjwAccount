/*
 * Copyright: 2018 dingxiang-inc.com Inc. All rights reserved.
 */


package com.guohao.account.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @FileName: StatusEnum.java
 * @Description: StatusEnum.java类说明
 * @Author: wh
 * @Date: 2019/1/22 16:57
 */
@Getter
@AllArgsConstructor
public enum StatusEnum {
    FASTEN_STATUS_CANCEL(-1, "系统异常失败"),
    FASTEN_STATUS_PROTECT_FAIL(-2, "保护失败"),
    FASTEN_STATUS_CREATE(0, "已经创建，等待中"),
    FASTEN_STATUS_PROTECTING(1, "处理中"),
    FASTEN_STATUS_FINNISH(2, "已完成");

    private int status;
    private String info;
}