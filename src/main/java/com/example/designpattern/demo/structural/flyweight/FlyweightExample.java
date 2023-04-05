package com.example.designpattern.demo.structural.flyweight;

import java.util.Random;

public class FlyweightExample {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };
    private static final Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    private static int getRandomX() {
        return random.nextInt(100);
    }

    private static int getRandomY() {
        return random.nextInt(100);
    }
}