package com.gu.learn.pattern;

/**
 * @author wjzhu
 * @createDate 2019-05-04 9:54
 */
public class MsgResult {

    private String code;
    private String msg;
    private String data;

    public String getCode() {
        return code;
    }

    public MsgResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public MsgResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getData() {
        return data;
    }

    public MsgResult setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "支付状态：" + code+ "," + msg  +", 支付详情：" + data ;
    }
}
