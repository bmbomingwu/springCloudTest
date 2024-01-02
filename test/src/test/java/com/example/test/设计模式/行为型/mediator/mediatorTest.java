package com.example.test.设计模式.行为型.mediator;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:00
 **/
public class mediatorTest {
    public static void main(String[] args){
        // 先创建三个角色，中介公司，房主，租客
        MediatorCompany mediatorCompany = new MediatorCompany();
        // 房主和租客都在同一家中介公司
        HouseOwner houseOwner = new HouseOwner("张三", mediatorCompany);
        Tenant tenant = new Tenant("李四", mediatorCompany);
        // 中介公司获取房主和租客的信息
        mediatorCompany.setHouseOwner(houseOwner);
        mediatorCompany.setTenant(tenant);
        // 房主和租客都在这家中介公司发布消息，获取到对应的消息
        tenant.connection(tenant.name + "想租一房一厅!");
        houseOwner.connection(houseOwner.name + "这里有!来看看呗!");
        // 测试结果
        // 房主张三获取到的信息:李四想租一房一厅!
        // 租客李四获取到的信息:张三这里有!来看看呗!
    }
}
