package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String name = "";
    private Double field = 0.0;

    public Triangle(String name, Double field) {
        this.name = getShapeName();
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public Double getField(double base, double high) {
        field = 0.5 * base * high;
        return field;
    }


}
