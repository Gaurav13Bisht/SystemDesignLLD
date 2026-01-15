package DesignPatterns.FactoryDesignPattern.ShapeExample.FactoryMethod;

/*
The benefit of this is now both creation and selection code is in separate classes so it follows SRP.
It still doesn't follow OC principle though.
 */

public class ShapeFactoryProvider {
    public static Shape getShape(String shapeType){
        Shape shape = null;
        if("CIRCLE".equals(shapeType)){
            ShapeFactory shapeFactory = new CircleFactory();
            shape = shapeFactory.createShape();
        }
        else if("SQUARE".equals(shapeType)){
            ShapeFactory shapeFactory = new SquareFactory();
            shape = shapeFactory.createShape();
        }
        else{
            throw new RuntimeException(shapeType + " shape not supported !");
        }

        return shape;
    }
}
