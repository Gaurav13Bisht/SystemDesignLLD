package LLDProblems.VendingMachine;

public class ShelfItem {
    public String itemName;
    public Integer price;

    public ShelfItem(String itemName, Integer price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
