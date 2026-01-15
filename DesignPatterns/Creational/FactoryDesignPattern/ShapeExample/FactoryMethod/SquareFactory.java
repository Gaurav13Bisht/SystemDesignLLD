package DesignPatterns.Creational.FactoryDesignPattern.ShapeExample.FactoryMethod;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        Square square = new Square();
        // Here you can initialise or set config as a centralised point
        return square;
    }
}
