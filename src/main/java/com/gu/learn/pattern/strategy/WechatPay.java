package com.gu.learn.pattern.strategy;

/**
 * @author wjzhu
 * @createDate 2019-05-04 10:05
 */
public class WechatPay extends Pay {

    @Override
    public String getName() {
        return "微信";
    }

    @Override
    protected double queryBlance(String uid) {
        return 300;
    }
}
