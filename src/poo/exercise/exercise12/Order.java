package poo.exercise.exercise12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Client client;
    private Date moment;
    private OrderStatus status;
    private final List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(Client client, Date moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        Double sum = 0.0;

        for (OrderItem orderItem : orderItems){
            sum += orderItem.subTotal();
        }

        return sum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem orderItems : orderItems){
            sb.append(orderItems).append('\n');
        }
        sb.append("Total price: $").append(total());
        return sb.toString();
    }
}
