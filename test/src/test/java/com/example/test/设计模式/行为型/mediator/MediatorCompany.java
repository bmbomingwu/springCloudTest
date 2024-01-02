package com.example.test.设计模式.行为型.mediator;

import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:58
 **/
// 中介公司(中介者)
@Data
public class MediatorCompany {
    private HouseOwner houseOwner;
    private Tenant tenant;
    public void connection(Person person, String message) {
        // 房主需要通过中介获取租客信息
        if (person.equals(houseOwner)) {
            this.tenant.getMessage(message);
        } else { // 反之租客通过中介获取房主信息
            this.houseOwner.getMessage(message);
        }
    }
}
