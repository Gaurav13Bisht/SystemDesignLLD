package DesignPatterns.FactoryDesignPattern.ShapeExample.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();

        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
