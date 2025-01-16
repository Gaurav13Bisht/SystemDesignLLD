package DecoratorDesignPattern.Decorators;

import DecoratorDesignPattern.BasicPizza;

public interface PizzaDecorator extends BasicPizza {
    public int calories();
    public int cost();
}