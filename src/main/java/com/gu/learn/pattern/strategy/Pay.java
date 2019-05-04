package com.gu.learn.pattern.strategy;

import com.gu.learn.pattern.MsgResult;

/**
 * @author wjzhu
 * @createDate 2019-05-04 9:49
 */
public abstract class Pay {

    public abstract String getName();

    protected abstract double queryBlance(String uid);

    public MsgResult pay(String uid,double amount){
        if(amount<queryBlance(uid)){
            return new MsgResult().setCode("500").setMsg("支付失败").setData("余额不足");
        }else{
            return new MsgResult().setCode("200").setMsg("支付成功").setData("支付金额："+amount);
        }
    }
}
