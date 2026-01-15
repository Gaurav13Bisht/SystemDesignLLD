package DesignPatterns.Creational.FactoryDesignPattern.ShapeExample.FactoryMethod;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        Circle circle = new Circle();
        // Here you can initialise or set config as a centralised point
        return circle;
    }
}