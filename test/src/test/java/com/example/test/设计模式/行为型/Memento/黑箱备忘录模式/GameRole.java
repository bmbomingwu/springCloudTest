package com.example.test.设计模式.行为型.Memento.黑箱备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:28
 **/
// 游戏角色类
@Data
public class GameRole {
    private Integer vit; // 生命力
    private Integer atk; // 攻击力
    private Integer def; // 防御力
    // 初始化状态
    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    // 战斗到0
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vit, this.atk, this.def);
    }
    // 回复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
    // 展示状态
    public void showState() {
        System.out.println("角色生命力:" + this.vit);
        System.out.println("角色攻击力:" + this.atk);
        System.out.println("角色防御力:" + this.def);
    }
    // 备忘录内部类
    @Data
    @AllArgsConstructor
    private class RoleStateMemento implements Memento {
        private Integer vit; // 生命力
        private Integer atk; // 攻击力
        private Integer def; // 防御力
    }
}