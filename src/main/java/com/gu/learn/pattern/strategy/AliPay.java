package com.gu.learn.pattern.strategy;

/**
 * @author wjzhu
 * @createDate 2019-05-04 9:51
 */
public class AliPay extends Pay{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBlance(String uid) {
        return 200;
    }
}
