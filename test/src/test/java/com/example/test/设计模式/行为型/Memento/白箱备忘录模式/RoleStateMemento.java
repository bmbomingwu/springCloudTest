package com.example.test.设计模式.行为型.Memento.白箱备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:24
 **/
// 游戏状态存储类(备忘录类)
@Data
@AllArgsConstructor
public class RoleStateMemento {
    private Integer vit; // 生命力
    private Integer atk; // 攻击力
    private Integer def; // 防御力
}
