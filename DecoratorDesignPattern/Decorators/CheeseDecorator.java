package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasicPizza;

public class CheeseDecorator implements PizzaDecorator{
    public BasicPizza basicPizza;

    public CheeseDecorator(BasicPizza basicPizza){
        this.basicPizza = basicPizza;
    }

    @Override
    public int calories() {
        return 400;
    }

    @Override
    public int cost(){
        return basicPizza.cost() + 66;
    }
}
