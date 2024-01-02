package com.example.test.设计模式.行为型.chainOfResponsibility.结合建造者模式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:05
 **/
// handler抽象类
public abstract class Handler {
    protected Handler next;
    // 返回handler方便链式操作
    public Handler next(Handler next) {
        this.next = next;
        return next;
    }
    // 流程开始的方法
    public abstract void doHandler(User user);
    static class Builder {
        private Handler head;
        private Handler tail;
        public Builder addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }
        public Handler build() {
            return this.head;
        }
    }
}

