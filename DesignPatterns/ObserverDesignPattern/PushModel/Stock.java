package DesignPatterns.ObserverDesignPattern.PushModel;

public class Stock {
    private Integer quantity;

    public Stock(Integer quantity, Integer price) {
        this.quantity = quantity;
        this.price = price;
    }

    private Integer price;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
