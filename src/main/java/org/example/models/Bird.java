package org.example.models;

import org.example.service.Animals;

public class Bird extends Animals {
    public Bird(String name, int runLength, int swimLength, double jumpHeight) {
        super(name, runLength, swimLength, jumpHeight);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println(name + " пробежала успешно");
        else System.out.println(name + " не смогла пробежать");
    }

    @Override
    public void swim(int length) {
        System.out.println("птички не умеют плавать");
    }

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= jumpHeight)) System.out.println(name + " прыгнула успешно");
        else System.out.println(name + " не смогла прыгнуть");
    }
}
