package org.example.models;

import org.example.service.Animals;

public class Horse extends Animals {
    public Horse(String name, int runLength, int swimLength, double jumpHeight) {
        super(name, runLength, swimLength, jumpHeight);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println(name + " пробежал успешно");
        else System.out.println(name + " не смог пробежать");
    }

    @Override
    public void swim(int length) {
        if ((length >= 0) && (length <= swimLength)) System.out.println(name + " проплыл успешно");
        else System.out.println(name + " не смог проплыть");
    }

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= jumpHeight)) System.out.println(name + " прыгнул успешно");
        else System.out.println(name + " не смог прыгнуть");
    }
}
