package DesignPatterns.FactoryDesignPattern.ShapeExample.SimpleFactory;

public class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square is drawn !");
    }
}