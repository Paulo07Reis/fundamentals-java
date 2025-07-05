package poo.exercise.exercise01.domain;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public double totalValueStock(){
        return (price * quantity);
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return """
            \n
            Product: %s,
            Price: $%.2f,
            Quantity: %d,
            Total: $%.2f
            \n
            """.formatted(getName(), getPrice(), getQuantity(), totalValueStock());
    }
}
