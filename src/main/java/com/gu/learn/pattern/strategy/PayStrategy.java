package com.gu.learn.pattern.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wjzhu
 * @createDate 2019-05-04 10:09
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WechatPay";

    private static Map<String,Pay> handleMapping = new ConcurrentHashMap<String,Pay>();
    static {
        handleMapping.put(ALI_PAY,new AliPay());
        handleMapping.put(WECHAT_PAY,new WechatPay());
    }

    public static Pay getInstance(String key){
        if(StringUtils.isBlank(key)){
            return handleMapping.get(ALI_PAY);
        }else {
            return handleMapping.get(key);
        }
    }
}
