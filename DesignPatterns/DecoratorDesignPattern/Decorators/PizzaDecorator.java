package DesignPatterns.DecoratorDesignPattern.Decorators;

import DesignPatterns.DecoratorDesignPattern.BasicPizza;

public interface PizzaDecorator extends BasicPizza {
    public int calories();
    public int cost();
}