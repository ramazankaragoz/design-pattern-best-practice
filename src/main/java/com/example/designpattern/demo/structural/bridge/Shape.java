package com.example.designpattern.demo.structural.bridge;

abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
    public abstract double getArea();
}
