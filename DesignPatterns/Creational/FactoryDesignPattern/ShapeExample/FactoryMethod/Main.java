package DesignPatterns.Creational.FactoryDesignPattern.ShapeExample.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactoryProvider.getShape("CIRCLE");
        shape1.draw();
        System.out.println("Area: " + shape1.calculateArea(10));

        Shape shape2 = ShapeFactoryProvider.getShape("SQUARE");
        shape2.draw();
        System.out.println("Area: " + shape2.calculateArea(10));

        Shape shape3 = ShapeFactoryProvider.getShape("RECTANGLE");
        shape3.draw();
    }
}