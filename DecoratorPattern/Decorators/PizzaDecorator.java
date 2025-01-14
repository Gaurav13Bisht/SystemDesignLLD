package DecoratorPattern.Decorators;

import DecoratorPattern.BasicPizza;

public interface PizzaDecorator extends BasicPizza {
    public int calories();
    public int cost();
}