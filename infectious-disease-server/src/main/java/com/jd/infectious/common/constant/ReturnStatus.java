package com.jd.infectious.common.constant;

/**
 * @desc: 返回码状态
 * @author: hongwei
 * @date: 2021/12/9 14:19
 */
public enum ReturnStatus {
    /**
     * 成功
     */
    OK(200, "success"),
    /**
     * 未授权
     */
    Authorization(401, "未授权,请检查检查token"),
    /**
     * token过期
     */
    ExpiredTOEKN(402, "token过期请，请重新获取token"),

    /**
     * token过期
     */
    ExpiredAuthCode(403, "验证码错误或失效"),
    /**
     * 参数检查错误
     */
    PARAM_CHECK_FAILED(499, "参数检查错误"),
    /**
     * 服务器异常
     */
    ERROR(500, "服务器错误"),
    /**
     * 京办接口调用异常
     */
    JB_API_ERROR(903, "调用京办接口失败，获取token错误"),
    /**
     * 政务账号不存在，需要绑定
     */
    JB_API_ACCOUNT(901, "政务端账号不存在，联系管理员！"),
    /**
     * app
     */
    APP_EXCEPTION(300, "app异常，请检查数据"),
    /**
     * 限流-单节点拒绝
     */
    REJECT(402, "请求频繁，请稍后再试!"),

    /**
     * 政务账号不存在，需要绑定
     */
    USER_EXCEPTION(902, "用户名或密码错误,请重新输入"),

    /**
     * 政务账号不存在，需要绑定
     */
    ENTERPRISE_EXCEPTION(904, "企业信息重复,请重新输入"),

    /**
     * 政务账号不存在，需要绑定
     */
    ENTERPRISE_CODE_OVERFLOW(905, "企业编码溢出,超出7位"),

    CITY_CODE_ID_OVERFLOW(920, "企业编码溢出,超出8位"),
    /**
     * 政务账号不存在，需要绑定
     */
    UNSUPPORTED_OPERATE_TYPE(906, "不支持的操作类型"),
    /**
     * 身份证格式非法
     */
    ID_CARD_FORMAT_ERROR(907, "身份证格式非法"),
    /**
     * 手机号格式非法
     */
    MOBILE_FORMAT_ERROR(908, "手机格式非法"),
    /**
     * 手机号不存在
     */
    MOBILE_NOT_EXIST_ERROR(909, "手机号不存在"),
    /**
     * 企业信息不存在
     */
    ENTERPRISE_NOT_EXIST_ERROR(910, "企业信息不存在"),

    /**
     * 一天发送的短信次数超过限制
     */
    AUTH_CODE_MAX_COUNT_ONE_DAY(911, "验证码错误次数超过限制,请重新获得验证码"),

    /**
     * 不可删除市级上传的单位
     */
    AUTH_REMOVE_COLLECT_ENTERPRISE_ERROR(912,"不能删除市级上传的单位"),

    /**
     * 登记簿不存在
     */
    COLLECT_SHARE_EMPTY_ERROR(913,"登记簿不存在"),

    /**
     * 该单位已纳入监管
     */
    COLLECT_ENTERPRISE_EXIST(914,"该单位已纳入监管"),

    Collect_SHARE_PEOPLE_ERROR(916, "散装散建人员删除操作出错"),


    CAN_NOT_DISTINGUISH_REPORT_TASK(597,"不能区分是报表或任务统计"),
    NO_LEVEL(598,"未知level"),
    NO_STATISTICS(600,"用户未配置任何行业类别的统计权限"),

    NO_INDUSTRY_STATISTICS(601,"用户指定行业类别未配置任何统计权限"),

    JB_API_USER_ERROR(602,"调用京办接口失败，未获取京办用户"),

    CANCLE_ENTERPRISE_SUPEVISE_ERROR(603,"不可取消他人的监管"),

    ENTERPRISE_SUPEVISE_EXISTED_WARN(604,"该单位已被他人纳入监管"),

    ENTERPRISE_SUPERVISOR_NOT_EXIST_WARN(605,"该单位未被他人监管,不需要转移"),

    ENTERPRISE_SUPERVISOR_CANNOT_TRANSFER_TO_ITSELF_WARN(606,"不能自己转给自己"),
    OWNER_USER_IS_NOT_ME(607,"本人不是基层人员指定的管理员"),
    /**
     * 企业信息删除报错
     */
    ENTERPRISE_DEL_OPT_ERROR(915, "企业删除操作出错"),
    /**
     * Excel文件解析失败
     */
    EXCEL_FILE_PARSING_FAILED(1001, "Excel文件解析失败");

    /**
     * 返回码
     */
    private final int code;
    /**
     * 返回信息
     */
    private final String message;

    ReturnStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
