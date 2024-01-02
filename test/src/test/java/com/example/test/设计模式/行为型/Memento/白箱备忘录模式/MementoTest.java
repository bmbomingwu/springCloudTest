package com.example.test.设计模式.行为型.Memento.白箱备忘录模式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:25
 **/
public class MementoTest {

    // 测试结果
    public static void main(String[] args){
        System.out.println("===========打boss前状态===========");
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.showState();
        // 保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("===========打boss后状态===========");
        gameRole.fight();
        gameRole.showState();
        System.out.println("===========恢复状态===========");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.showState();
        // ===========打boss前状态===========
        // 角色生命力:100
        // 角色攻击力:100
        // 角色防御力:100
        // ===========打boss后状态===========
        // 角色生命力:0
        // 角色攻击力:0
        // 角色防御力:0
        // ===========恢复状态===========
        // 角色生命力:100
        // 角色攻击力:100
        // 角色防御力:100
    }
}
