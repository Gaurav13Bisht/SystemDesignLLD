package DesignPatterns.FactoryDesignPattern.ShapeExample.SimpleFactory;

/*
The drawback of Simple factory pattern is now this class is responsible for creation and selection of
objects so it breaks SRP and OC principle
 */

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if("CIRCLE".equals(shapeType)){
            return new Circle();
        }
        else if("SQUARE".equals(shapeType)){
            return new Square();
        }
        else{
            throw new RuntimeException(shapeType + " shape not supported !");
        }
    }
}
