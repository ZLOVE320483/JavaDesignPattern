package com.zlove.main.facade;

/**
 * Created by ZLOVE on 17/1/15.
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer is start...");
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("Computer is shutdown...");
    }
}
