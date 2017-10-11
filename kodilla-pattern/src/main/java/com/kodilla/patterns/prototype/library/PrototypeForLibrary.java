package com.kodilla.patterns.prototype.library;

public class PrototypeForLibrary<U> implements Cloneable {

    @Override
    public U clone() throws CloneNotSupportedException {
        return (U) super.clone();
    }
}
