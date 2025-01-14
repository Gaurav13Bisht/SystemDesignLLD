package DecoratorPattern;

import DecoratorPattern.Decorators.CheeseDecorator;
import DecoratorPattern.Decorators.JalepenoDecorator;

public class Main {
    public static void main(String[] args) {
        GreekPizza greekPizza = new GreekPizza();
        System.out.println(greekPizza.cost());

        JalepenoDecorator jalepenoDecorator = new JalepenoDecorator(greekPizza);
        System.out.println(jalepenoDecorator.cost());

        JalepenoDecorator jalepenoDecorator2 = new JalepenoDecorator(jalepenoDecorator);
        System.out.println(jalepenoDecorator2.cost());

        CheeseDecorator cheeseDecorator = new CheeseDecorator(jalepenoDecorator2);
        System.out.println(cheeseDecorator.cost());


    }
}
