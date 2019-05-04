package com.gu.learn.pattern;

import com.gu.learn.pattern.strategy.Pay;
import com.gu.learn.pattern.strategy.PayStrategy;

/**
 * @author wjzhu
 * @createDate 2019-05-04 10:06
 */
public class Order {
    private String uid;
    private double amount;

    public Order(String uid, double amount) {
        this.uid = uid;
        this.amount = amount;
    }

    public MsgResult pay(){
        return pay(PayStrategy.ALI_PAY);
    }

    public MsgResult pay(String key){
        Pay pay = PayStrategy.getInstance(key);
        System.out.println("本次采用的支付方式："+pay.getName());
        System.out.println("本次交易金额："+amount+",开始扣款");
        return pay.pay(uid,amount);
    }
}
