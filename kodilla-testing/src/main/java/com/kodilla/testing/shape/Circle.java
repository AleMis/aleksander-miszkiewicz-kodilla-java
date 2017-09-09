package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name = "";
    private Double field = 0.0;

    public Circle(String name, Double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public Double getField(double r) {
        Double pi = 3.14;
        field = (pi * r)*(pi * r);
        return field;
    }
}
