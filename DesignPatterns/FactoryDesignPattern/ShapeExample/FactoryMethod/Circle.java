package DesignPatterns.FactoryDesignPattern.ShapeExample.FactoryMethod;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Circle is drawn !");
    }

    @Override
    public Double calculateArea(Integer radius){
        return 3.14 * radius * radius;
    }
}