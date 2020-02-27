package com.guohao.account.constant;

/**
 * @FileName: Constant.java
 * @Description: Constant.java类说明
 * @Author: wh
 * @Date: 2018/4/23 11:43
 */
public interface Constant {

    /**
     * 日期格式
     */
    String TIME_FORMAT = "YYYY-MM-dd";

    /**
     * 分隔符号
     */
    String SPLIT = ",";

    /**
     * 消费签名的时间戳
     */
    Long DEFAULT_TIMESTAMP_EXPIRE = 1000 * 60 * 5L;

    /**
     * 日志名称
     */
    String LOG_NAME = "/log.txt";

    /**
     * 报告名称
     */
    String REPORT_NAME = "/report.pdf";

    /**
     * so文件后缀
     */
    String SO_SUFFIX = ".so";

    /**
     * 安卓包扫描获取信息类型
     */
    Integer ANDROID_SCAN_GEI_INFO_TYPE = 1;

    /**
     * 二进制保护获取信息类型
     */
    Integer BINARY_GEI_INFO_TYPE = 10;

}
