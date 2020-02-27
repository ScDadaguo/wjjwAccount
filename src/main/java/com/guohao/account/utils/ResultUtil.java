package com.guohao.account.utils;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.guohao.account.common.ApiResult;
import com.guohao.account.common.CallbackParam;
import com.guohao.account.constant.ErrorCodeEnum;
import org.apache.commons.lang3.StringUtils;
import com.alibaba.fastjson.JSON;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 返回结果构造类
 * <p>
 * Created by wuling on 2017/5/16.
 */
public class ResultUtil {

    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    private static String regEx = "[`~!@#$%^&*()+=|{}':;,\\[\\].<>/?￥（）—【】‘；：”“’。，、？]";
    private static Pattern compile = Pattern.compile(regEx);

    /**
     * 根据请求参数和响应结果构造 {@link ApiResult}
     *
     * @param data
     *            返回的结果
     * @param param
     *            提交的请求参数
     * @return
     */
    public static Object getSuccessResult(Object data, CallbackParam param) {
        judgeCallBackParam(param);
        // 返回JSONP格式
        if (param != null && StringUtils.isNotBlank(param.getCallback())) {
            return returnJSONPString(param, returnJSONString(ApiResult.getSuccess(data), null));
        }

        return returnJSONString(ApiResult.getSuccess(data), null);
    }

    /**
     * 根据请求参数和响应结果构造 {@link ApiResult}
     *
     * @param data
     *            返回的结果
     * @return
     */
    public static Object getSuccessResult(Object data) {
        return returnJSONString(ApiResult.getSuccess(data), null);
    }

    public static Object getSuccessResult(ErrorCodeEnum errorCodeEnum) {
        return returnJSONString(ApiResult.getSuccess(errorCodeEnum.name(), errorCodeEnum.getCode()), null);
    }

    private static String returnJSONString(ApiResult result, String format) {

        if (StringUtils.isBlank(format)) {
            return JSON.toJSONStringWithDateFormat(result, YYYY_MM_DD_HH_MM_SS,
                SerializerFeature.WriteDateUseDateFormat);
        } else {
            return JSON.toJSONStringWithDateFormat(result, format, SerializerFeature.WriteDateUseDateFormat);
        }
    }

    private static Object returnJSONPString(CallbackParam param, String jsonString) {
        StringBuilder sb = new StringBuilder(64);
        if (param != null && StringUtils.isNotBlank(param.getScriptWrapping())) {
            sb.append("<script>");
            if (StringUtils.isNotBlank(param.getCallback())) {
                sb.append(param.getCallback()).append("(").append(jsonString).append(")");
            } else {
                sb.append(jsonString);
            }
            sb.append("</script>");
            return sb.toString();
        }
        if (param != null && StringUtils.isNotBlank(param.getCallback())) {
            sb.append(param.getCallback()).append("(").append(jsonString).append(")");
            return sb.toString();
        }
        return sb;
    }

    /**
     * 根据请求参数和响应结果构造 {@link ApiResult}
     *
     * @param msg
     *            错误描述
     * @param param
     *            提交的请求参数
     * @return
     */
    public static Object getFailedResult(String msg, CallbackParam param) {
        judgeCallBackParam(param);
        // 返回JSONP格式
        if (param != null && StringUtils.isNotBlank(param.getCallback())) {
            return returnJSONPString(param, returnJSONString(ApiResult.getFailed(msg), null));
        }

        return returnJSONString(ApiResult.getFailed(msg), null);
    }

    /**
     * 根据请求参数和响应结果构造 {@link ApiResult}
     *
     * @param msg
     *            错误描述
     * @return
     */
    public static Object getFailedResult(String msg) {
        return returnJSONString(ApiResult.getFailed(msg), null);
    }

    public static Object getFailedResult(String code, String msg) {
        return returnJSONString(ApiResult.getFailed(msg, code), null);
    }

    public static Object getFailedResult(ErrorCodeEnum errorCodeEnum) {
        return returnJSONString(ApiResult.getFailed(errorCodeEnum.name(), errorCodeEnum.getCode()), null);
    }

    private static void judgeCallBackParam(CallbackParam param) {
        if (null != param) {
            String callBack = param.getCallback();
            if (StringUtils.isNoneBlank(callBack)) {
                Matcher matcher = compile.matcher(callBack);
                String result = matcher.replaceAll("%");
                param.setCallback(result);
            }
        }
    }
}
