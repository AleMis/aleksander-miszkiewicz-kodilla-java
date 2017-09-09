package com.kodilla.testing.shape;



public class Square implements Shape{
    private String name = "";
    private Double field = 0.0;

    public Square(String name, Double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public Double getField(double a, double b) {
        field = a * b;
        return field;
    }
}
