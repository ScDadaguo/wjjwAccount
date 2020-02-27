package com.guohao.account.constant;

/**
 * Created by wuling on 2017/5/22.
 */
public interface ErrorMessage {

    String INTERNAL_SERVER = "系统出现异常，请稍后重试。";

    String FILE_ERROR = "文件内容错误";

    String NAME_EXIST = "中文名称已存在";

    String CODE_EXIST = "code已存在";

    String PERMISSION_DENIED = "对不起,您没有删除权限~";

    String NOT_ALLOW_OPERATE = "请注意：您当前角色无权限进行此操作";

    String NO_LOGIN = "登录失效，请重新登录！";

    String ES_SHARD = "all shards failed";

    String UNSURPPORT_TIME_STYLE = "不支持的时间格式";

    String WINDOW_LARGE = "Result window is too large";
    String WINDOW_LARGE_MSG = "返回窗口过大，请增加更多的筛选条件";

    String DEPARTMENT_SWITCH = "请切换部门后执行该操作";

    interface Review {

        String WAITING_REVIEW = "有审核流程，暂不能提交操作";
        String ENTER_REVIEW = "您的操作已提交审核，审核通过后生效。";
        String MODEL_WAITING_REVIEW = "本模型有其他审核流程";
        String MODEL_URL_WAITING_REVIEW = "模型地址修改审核中";
        String MODEL_ADDRESS_CHANGED = "模型地址已修改，请审核通过后再进行操作";
        String MODEL_NOT_REVIEW = "列表中当前的模型还没有进行审核";
        String NO_CHANGES = "无数据变化";
    }

    interface Policy {
        String UPDATE_RULE = "更新规则失败";
        String UNSURPPORT_TYPE = "不支持类型";
    }

    interface Code {
        // 被踢
        String COOKIE_INVALID = "-1002";
        // 登录失效
        String LOGIN_INVALID = "-1001";
    }

    interface Log {
        String DETAIL_THREAD = "获取日志详情线程出错.";
        String EXCEED_MAX_OFFSET = "查询记录超出10000条，请使用更精确查询条件!";
    }

    interface Risk {
        String UNSURPPORT_TYPE = "位置业务类型";
    }

}
