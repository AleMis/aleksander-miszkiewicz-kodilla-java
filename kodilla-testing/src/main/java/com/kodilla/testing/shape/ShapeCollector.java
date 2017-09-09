package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figureList = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        figureList.add(shape);
    }


    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int index) {
        Shape shape = null;
        if(index>=0 && index < figureList.size()) {
            shape = figureList.get(index);
        }
        return shape;
    }

    public void showFigures() {
        for(Shape list: figureList) {
            System.out.println(list);
        }
    }

    public int getFigureNumbers() {
        return figureList.size();
    }

    public ArrayList<Shape> getFigureList() {
        return figureList;
    }
}
