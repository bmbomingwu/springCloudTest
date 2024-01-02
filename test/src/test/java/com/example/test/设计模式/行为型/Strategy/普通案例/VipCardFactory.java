package com.example.test.设计模式.行为型.Strategy.普通案例;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:29
 **/
// 会员卡容器类
public class VipCardFactory {
    private static Map<String, VipCard> map = new ConcurrentHashMap<>();
    static {
        map.put("gold", new GoldCard());
        map.put("silver", new SilverCard());
        map.put("copper", new CopperCard());
    }
    public static VipCard getVIPCard(String level) {
        return map.get(level) != null ? map.get(level) : new Normal();
    }

}
