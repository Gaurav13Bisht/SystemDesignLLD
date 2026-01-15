package DesignPatterns.FactoryDesignPattern.ShapeExample.SimpleFactory;

public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle is drawn !");
    }
}