package SOLID.InterfaceSegregation;

    /*  This is following Interface Segregation principle since any class which will implement each interface
        according to the type of employee required ie Waiter or Cook will not need to give dummy implementation
        for unnecessary methods/behaviors since we have SEGREGATED the interface such that each contains only
        relevant methods/behaviour specific to the particular need.
     */

public interface RestaurantWaiter {
    void serveFood();
    void bringBill();
}

interface RestaurantCook{
    void typeOfFood();
    void cookFood();
}

//-----------------------------------------------------------------------------------------------------

class WaiterTypeA implements RestaurantWaiter{

    @Override
    public void serveFood() {
        // Code for serve food
    }

    @Override
    public void bringBill() {
        // Code for bring bill
    }
}

class CookTypeA implements RestaurantCook{

    @Override
    public void typeOfFood() {
        // Code for type of food like veg, non-veg, continental, chinese.
    }

    @Override
    public void cookFood() {
        // Code for cooking food
    }
}