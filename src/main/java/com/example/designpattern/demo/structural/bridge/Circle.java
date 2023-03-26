package com.example.designpattern.demo.structural.bridge;

public class Circle extends Shape{

    private double x,y,radius;

    public Circle(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x,y,radius);
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
