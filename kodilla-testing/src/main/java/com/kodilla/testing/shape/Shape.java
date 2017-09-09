package com.kodilla.testing.shape;

public interface Shape {
    String name = "";
    Double field = 0.0;

    static String getShapeName() {
        return name;
    }

    static Double getField() {
        return field;
    }
}
