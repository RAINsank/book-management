package com.itheima.book.enums;

/**
 * @author san qian
 **/
public enum CodeEnum implements Code{
    ERROR(0, "操作失败"),
    SUCCESS(1, "操作成功"),

    DATA_ERROR(0, "参数异常"),
    NO_RESPONSE_DATA(0, "无响应数据"),
    SYSTEM_PASSWORD_ERROR(0, "账号或密码错误")
    ;
    private final int code;
    private final String msg;
    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    @Override
    public int getCode() {
        return code;
    }


    @Override
    public String getMsg() {
        return msg;
    }
}
