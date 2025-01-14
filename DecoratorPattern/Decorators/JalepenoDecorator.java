package DecoratorPattern.Decorators;

import DecoratorPattern.BasicPizza;

public class JalepenoDecorator implements PizzaDecorator{

    public BasicPizza basicPizza;

    public JalepenoDecorator(BasicPizza basicPizza){
        this.basicPizza = basicPizza;
    }

    @Override
    public int calories() {
        return 300;
    }

    @Override
    public int cost(){
        return basicPizza.cost() + 79;
    }
}
