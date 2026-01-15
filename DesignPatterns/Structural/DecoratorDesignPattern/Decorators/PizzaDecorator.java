package DesignPatterns.Structural.DecoratorDesignPattern.Decorators;

import DesignPatterns.Structural.DecoratorDesignPattern.BasicPizza;

public interface PizzaDecorator extends BasicPizza {
    public int calories();
    public int cost();
}