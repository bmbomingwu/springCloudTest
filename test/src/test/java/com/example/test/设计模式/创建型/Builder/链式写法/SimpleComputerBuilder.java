package com.example.test.设计模式.创建型.Builder.链式写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:21
 **/
// 链式写法建造者类
public class SimpleComputerBuilder {
    private Computer computer = new Computer();
    public SimpleComputerBuilder buildMotherBoard(String motherBoard){
        computer.setMotherboard(motherBoard);
        return this;
    }
    public SimpleComputerBuilder buildCpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }
    public SimpleComputerBuilder buildMemory(String memory){
        computer.setMemory(memory);
        return this;
    }
    public SimpleComputerBuilder buildDisk(String disk){
        computer.setDisk(disk);
        return this;
    }
    public SimpleComputerBuilder buildGpu(String gpu){
        computer.setGpu(gpu);
        return this;
    }
    public SimpleComputerBuilder buildPower(String power){
        computer.setPower(power);
        return this;
    }
    public SimpleComputerBuilder buildHeatSink(String heatSink){
        computer.setHeatSink(heatSink);
        return this;
    }
    public SimpleComputerBuilder buildChassis(String chassis){
        computer.setChassis(chassis);
        return this;
    }
    public Computer build(){
        return computer;
    }
}

