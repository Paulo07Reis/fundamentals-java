package poo.exercise.exercise12.Entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem() {}

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Double subTotal(){
        return quantity * product.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product + ", Quantity: " + quantity + ", Subtotal: $" + subTotal();
    }
}
