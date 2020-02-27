/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

package com.guohao.account.constant;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @FileName: ErrorCodeEnum.java
 * @Description: ErrorCodeEnum.java类说明
 * @Author: tshi
 * @Date: 2018/10/12 14:01
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    SUCCESS("200", "操作成功"),
    // 登录认证问题
    NO_LOGIN("-1001", "用户未登陆"), USER_NAME_EXIST("-1002", "用户名已存在"), OLD_PASSWORD_ERROR("-1003", "原密码输入错误"),
    PASSWORD_NOT_MATCH("-1004", "密码输入不一致"), USER_EXPIRED("-1005", "用户已经过期"), USER_NO_ACTIVE("-1006", "用户未激活"),
    LOGIN_FAIL("-1007", "登陆失败"), PWD_ERROR("-1008", "密码错误"), AUTHORIZE_ERROR("-1009", "授权失败"),
    TOKEN_INVALID("-1010", "请求凭证校验失败"), USER_NO_EXIST("-1011", "用户不存在"),
    // 更新包枚举
    UPDATE_FILE_LOWER("-2001", "更新包版本过低"), UPDATE_FILE_INVALID("-2002", "更新包不合法"),
    UPDATE_FILE_CONTENT_INVALID("-2003", "更新包校验失败"),
    // 文件枚举
    FILE_UPLOAD_ERROR("-3001", "文件上传失败"), FILE_UPLOAD_INVALID("-3002", "文件不合法"), FILE_NOT_FOUND("-3003", "未检测到上传文件"),
    FILE_NO_EXIST("-3004", "文件不存在"), FILE_NAME_ILLEGAL("-3005", "文件名称不合法"), FILE_SIZE_ILLEGAL("-3006", "文件大小不合法"),
    TASK_DOWNLOAD_ERROR("-3007", "文件下载失败"),
    // 策略文件
    STRATEGY_FILE_PARSE_ERROR("-4001", "策略文件解析异常"), STRATEGY_FILE_NOT_FOUND("-4002", "未检测到指定策略文件"),
    CONFIG_FILE_PARSE_FAIL("-4003", "配置文件解析失败"),
    // 包校验问题
    RS_ANDROID_NOT_APK("-5001", "apk文件格式错误或已损坏"), RS_ANDROID_READ_APK_FAIL("-5002", "apk文件解析失败"),
    RS_ANDROID_NO_SIGN("-5003", "请上传已签名的apk文件"), RS_ANDROID_DETECTED_SHELL("-5004", "apk文件已经被加固"),
    RS_ANDROID_NOT_SDK("-5005", "输入文件为非aar或jar文件"), RS_ANDROID_FEATURE_PARSE_FAIL("-5006", "配置解析失败"),
    RS_IDS_READ_FILE_FAIL("-5007", "iOS输入包格式错误"), RS_IOS_NOT_ZIP("-5008", "上传文件为非合法的zip文件"),
    RS_IOS_PLIST_NOT_FOUND("-5009", "iOS输入文件格式错误或已损坏"), RS_IOS_EXECUTABLE_NOT_FOUND("-5010", "iOS输入文件格式错误或已损坏"),
    RS_IOS_PLIST_PARS_ERROR("-5011", "plist文件解析错误"), RS_IFS_EXECUTABLE_BROKEN("-5012", "可执行文件已损坏"),
    RS_IOS_BIT_CODE_NOT_OPEN("-5013", "未开启bitCode"), RS_IOS_BIT_CODE_ONLY_BIT_CODE_MARKER("-5014", "仅开启bitCodeMaker"),
    RS_IOS_FAILED_UNCOMPRESS_STATIC_LIB("-5015", "静态库解压失败"), RS_IOS_FAILED_EXTRACTOR_MACHO("-5016", "解压macho失败"),
    RS_IOS_NOT_ALL_OBJ_SUPPORT("-5017", "iOS非全object支持bitCode"), RS_FAILED_MKDIRS("-5018", "目录操作失败"),
    RS_IOS_IN_PLIST_NOT_FOUND("-5022", "iOS输入文件格式错误或已损坏"), RS_ANDROID_NOT_ZIP("-5023", "输入文件为非合法的zip文件"),
    RS_SO_IS_NOT_ELF("-5024", "当前文件并不是ELF文件"), RS_SO_IS_NOT_ANDROID_ELF("-5025", "当前文件并不是Android平台上的ELF文件"),
    RS_SO_ELF_HAD_BEEN_PROTECTED("-5026", "当前文件已经被保护过"), RS_SO_IS_NOT_ZIP_OR_AAR("-5027", "当前文件并不是合法的ZIP文件"),
    RS_SO_NOT_ANY_ELF("-5028", "当前ZIP文件并没有包含至少一个ELF文件"), RS_API_ONLY_SUPPORT_SINGLE_SO("-5029", "API接入仅支持单个SO文件"),
    // 参数问题
    PARAM_ILLEGAL("-6001", "参数校验失败"), PARAMETER_MISS("-6002", "请求参数不存在"), PARAMETER_VERIFY_FAILED("-6003", "参数校验失败"),
    PROTECT_CLASS_EMPTY("-6004", "关键类保护的所选类不能为空"), ANDROID_SDK_LEAK_PARAM("-6005", "Android SDK缺少入口类entryClass参数"),
    LIMITED_PACKAGE_NAME("-6006", "包名受限，请联系相关人员"),
    // 任务问题
    TASK_NOT_FIND("-7001", "任务不存在"), TASK_STATUS_ERROR("-7002", "任务状态异常"), TASK_HAS_FINISH("-7003", "任务重复结束"),
    EXIST_NO_NEW_TASK("-7002", "暂无可消费的任务"),
    TASK_NO_FINISHED("-7004", "任务未完成，无法下载"), SYNC_DOWN_TASK_TOO_MANY("-7005", "同步下载任务过多，请稍后重试"),
    SIGN_ERR("-7006", "签名错误"),
    // 其他
    REQUEST_METHOD_NOT_SUPPORT("-8001", "请求方法错误"), OPERATION_ERROR("-8002", "操作失败"), UNKNOWN_ERROR("-8003", "未知错误"),
    INTERNAL_ERROR("-8004", "服务内部错误"),;

    private String code;
    private String message;

    @Override
    public String toString() {
        return "{\"code':\"" + this.code + "\",\"message\":\"" + this.message + "\"}";
    }

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        ErrorCodeEnum[] errorCodeEnum = ErrorCodeEnum.values();
        for (ErrorCodeEnum enumItem : errorCodeEnum) {
            map.put(enumItem.code, enumItem.getMessage());
        }
        System.out.println(JSON.toJSONString(map));
    }

    public static ErrorCodeEnum getErrorCodeEnum(String code) {
        ErrorCodeEnum[] errorCodeEnum = ErrorCodeEnum.values();
        for (ErrorCodeEnum enumItem : errorCodeEnum) {
            if (enumItem.getCode().equals(code)) {
                return enumItem;
            }
        }
        return ErrorCodeEnum.UNKNOWN_ERROR;
    }
}
