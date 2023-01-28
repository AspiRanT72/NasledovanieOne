package org.example;

import org.example.models.*;
import org.example.service.Animals;

public class Main {

    public static void main(String[] args) {
        Animals cat = new Cat("Барсик",200, 0, 2);
        cat.run(200);
        cat.swim(10);
        cat.jump(2);
        Animals bird = new Bird("Сорока",5, 0, 0.2);
        bird.run(5);
        bird.swim(10);
        bird.jump(0.2);
        Animals dog = new Dog("Шарик",500, 10, 0.5);
        dog.run(500);
        dog.swim(10);
        dog.jump(0.5);
        Animals horse = new Horse("Спирит",1500, 100, 3);
        horse.run(1500);
        horse.swim(100);
        horse.jump(3);
    }
}