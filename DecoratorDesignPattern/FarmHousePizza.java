package DecoratorDesignPattern;

public class FarmHousePizza implements BasicPizza{
    @Override
    public int cost() {
        return 100;
    }
}
