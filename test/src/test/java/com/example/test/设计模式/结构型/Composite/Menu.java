package com.example.test.设计模式.结构型.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:47
 **/
// 菜单类
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList = new ArrayList<>();
    public Menu(String name,int level){
        this.level = level;
        this.name = name;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(Integer i) {
        return menuComponentList.get(i);
    }
    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
