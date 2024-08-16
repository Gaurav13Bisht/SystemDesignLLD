package SOLID.InterfaceSegregation;

    /*  This design do not follow Interface Segregation principle which states that:
         "Interface should be made such that the classes which implements it should not need to provide
         implementation for the methods/behaviours it does not need"

        Here, if Waiter class implements this Restaurant Employee than it will have to provide dummy
        implementations for washDishes() and cookDishes() even though this is not the behaviour of Waiter class.
        Same for Cook class and Dishwasher class.
     */

public interface RestaurantEmployee {
    void serveFood();
    void washDishes();
    void cookDishes();
}

//-----------------------------------------------------------------------------------------------------

class Waiter implements RestaurantEmployee{

    @Override
    public void serveFood() {
        // Code to serve food
    }

    @Override
    public void washDishes() {
        // Not Waiter class's expected behaviour so empty method
    }

    @Override
    public void cookDishes() {
        // Not Waiter class's expected behaviour so empty method
    }
}