package com.gu.learn.pattern;

/**
 * @author wjzhu
 * @createDate 2019-05-04 10:06
 */
public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("2012050411111",250);

        System.out.println(order.pay());

    }
}
