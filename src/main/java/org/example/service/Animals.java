package org.example.service;

public abstract class Animals {
    protected String name;
    protected int runLength;
    protected int swimLength;
    protected double jumpHeight;

    public abstract void run(int length);

    public abstract void swim(int length);

    public abstract void jump(double height);

    public Animals(String name, int runLength, int swimLength, double jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.jumpHeight = jumpHeight;
    }
}
