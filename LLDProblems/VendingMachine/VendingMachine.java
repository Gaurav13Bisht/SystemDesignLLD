package LLDProblems.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public String state;
    public ShelfItem[] shelfItems;
    public List<Integer> coins;

    public VendingMachine() {
        state = "Idle";
        this.shelfItems = new ShelfItem[30];
        coins = new ArrayList<>();
    }

    public ShelfItem[] getShelfItems() {
        return shelfItems;
    }

    public void setShelfItems(ShelfItem[] shelfItems) {
        this.shelfItems = shelfItems;
    }

    public List<Integer> getCoins() {
        return coins;
    }

    public void setCoins(List<Integer> coins) {
        this.coins = coins;
    }
}
