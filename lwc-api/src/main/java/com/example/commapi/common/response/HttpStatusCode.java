package com.example.commapi.common.response;

 /**
  * @author: liuwangcheng
  * @package: com.example.base.common.response
  * @class: HttpStatusCode
  * @datetime: 2019/9/3 14:27
  * @methodParameters:
  * @desc http 状态
  */
public enum HttpStatusCode {

    // 成功
    CODE_SUCCESS("200", "操作成功"),
    // 服务器内部错误
    CODE_SERVER_INTERNAL_ERROR("500", "服务器内部错误"),
    //未登录
    CODE_USER_NOT_LOGIN("-1", "未登录"),

    CODE_SERVER_PARAM_IS_NULL("415","参数类型不匹配"),
    CODE_SERVER_PARAM_ERROR("422","参数校验错误"),
    CODE_SERVER_PARAMS_ERROR("423","学生老师时间冲突"),
    CODE_SERVER_PARAMS_TIME_ERROR("424","学生老师时间冲突"),

    CODE_STUDENT_ID_ERROR("1000021", "此学生不存在"),
    CODE_STUDENT_PHONE_ERROR("1000022","此手机号已存在"),
    //用户名或密码错误
    CODE_USER_NAME_OR_PASSWORD_ERROR("1000041", "用户名或密码错误"),

    //参数不正确
    PARAM_ERROR("1000021", "参数不正确"),
    //数据不存在
    DATA_NOT_EXIST("1000022", "请求的数据不存在"),
    ORDER_NOT_EXIST("100023", "订单不存在"),
    // 不能重复购买
    ORDER_EXIST("1000032", "您已有班级，请勿重复购买"),
    //数据不存在
    SB2FILE_NOT_EXIST("1000023", "请上传课程作业"),
    //用户名或密码错误
    UPLOAD_FAIL("1000020", "上传失败"),
    PHONE_EXISTS("1000025", "手机号已存在"),

    PRIZE_EXISTS("1000101", "同一级别只能有一个奖品"),

    CODE_STUDENT_NOT_JOIN_GROUPON("1000081","未参加拼团"),

    VERIFICATION_ERROR("1000040","验证码不正确"),

    STUDENTID_ISNULL("1000041","学生编号为空"),
    ACTIONID_ISNULL("1000042","活动编号为空"),
    STUDENTID_ISERROR("1000043","学生编号错误"),
    STUDENTID_NOEXIST("1000044","学生编号不存在"),
    SELECTED_SPARE_START_TIME_ISNULL("1000045","所选开始时间不能为空"),
    SELECTED_SPARE_END_TIME_ISNULL("1000046","所选结束时间不能为空"),
    SPARE_TIME_ISNULL("1000047","空闲时间不能为空"),
    SPARE_TIME_ISERROR("1000047","空闲时间格式错误"),
    STUDENT_NUM_NOTEXISTS("1000048", "所选的学员数量和班级类型不匹配"),
    STUDENT_ORDER_ERROR("1000049", "学生订单中班级类型为空，请前往订单管理修改"),
    COURSEID_ISNULL("1000050", "课程ID为空"),
    STUDENT_NOTHAVE_COURSEID("1000051", "学生没有该课程订单"),

    AUTH_TOKEN_ISNULL("1000062","请重新登录"),
    AUTH_TOKEN_ISNOTEXISTS("1000063","请重新登录"),

    ORDER_ISPAY("1000033","订单已经支付");


    private String value;
    private String desc;

    private HttpStatusCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static HttpStatusCode getByValue(String value) {
        for (HttpStatusCode ve : values()) {
            if (value == ve.value) {
                return ve;
            }
        }
        return CODE_SUCCESS;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
