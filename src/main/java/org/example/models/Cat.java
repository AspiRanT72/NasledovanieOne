package org.example.models;

import org.example.service.Animals;

public class Cat extends Animals {

    public Cat(String name, int runLength, int swimLength, double jumpHeight) {
        super(name, runLength, swimLength, jumpHeight);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println(name + " пробежал успешно");
        else System.out.println(name + " не смог пробежать");
    }

    @Override
    public void swim(int length) {
        System.out.println("котики не умеют плавать");
    }

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= jumpHeight)) System.out.println(name + " прыгнул успешно");
        else System.out.println(name + " не смог прыгнуть");
    }
}
