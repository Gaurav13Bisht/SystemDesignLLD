package DecoratorPattern;

public class GreekPizza implements BasicPizza{
    @Override
    public int cost() {
        return 150;
    }
}