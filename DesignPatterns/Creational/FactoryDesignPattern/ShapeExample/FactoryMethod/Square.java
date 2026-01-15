package DesignPatterns.Creational.FactoryDesignPattern.ShapeExample.FactoryMethod;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Square is drawn !");
    }

    @Override
    public Double calculateArea(Integer sideLength){
        return (double) (sideLength * sideLength);
    }
}