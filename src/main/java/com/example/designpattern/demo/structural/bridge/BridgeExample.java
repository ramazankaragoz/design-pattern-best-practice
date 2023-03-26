package com.example.designpattern.demo.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeExample {

    public static void main(String[] args) {
        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle(new DrawingAPI1(),1,2,3));
        shapes.add(new Circle(new DrawingAPI2(),1,2,3));

        shapes.forEach(shape -> {
            shape.draw();
            System.out.println("Area: "+shape.getArea());
        });
    }
}
