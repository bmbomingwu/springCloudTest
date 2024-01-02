package com.example.test.设计模式.创建型.Builder.简化写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:21
 **/
// 把指挥者类和抽象建造者合在一起的简化建造者类
public class SimpleComputerBuilder {
    private Computer computer = new Computer();
    public void buildMotherBoard(String motherBoard){
        computer.setMotherboard(motherBoard);
    }
    public void buildCpu(String cpu){
        computer.setCpu(cpu);
    }
    public void buildMemory(String memory){
        computer.setMemory(memory);
    }
    public void buildDisk(String disk){
        computer.setDisk(disk);
    }
    public void buildGpu(String gpu){
        computer.setGpu(gpu);
    }
    public void buildPower(String power){
        computer.setPower(power);
    }
    public void buildHeatSink(String heatSink){
        computer.setHeatSink(heatSink);
    }
    public void buildChassis(String chassis){
        computer.setChassis(chassis);
    }
    public Computer build(){
        return computer;
    }
}


