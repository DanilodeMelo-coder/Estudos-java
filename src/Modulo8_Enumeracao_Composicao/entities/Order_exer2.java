package Modulo8_Enumeracao_Composicao.entities;

import Modulo8_Enumeracao_Composicao.entities.enums.Order_Status;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_exer2 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private Order_Status status;

    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();


    public Order_exer2(Date moment, Client client, Order_Status status) {
        this.moment = moment;
        this.client = client;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }


    public Order_Status getStatus() {
        return status;
    }

    public void setStatus(Order_Status status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public double total() {

        double sum = 0;
        for (OrderItem orderItem : orderItems) {

            sum += orderItem.subTotal();
        }

        return sum;
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:" + "\n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " " + sdf2.format(client.getDate()) + " - " + client.getEmail() + "\n");
        sb.append("Order items: ");

        for(OrderItem oI: orderItems){

            sb.append(oI.getProduct().getName() + ", " +
                      "$" + oI.getPrice() + ", " +
                      "Quantity: " + oI.getQuantity() + ", " +
                      "SubTotal: " + "$" + oI.subTotal() + "\n");
        }

        sb.append("Total price: $" + total());

        return sb.toString();
    }
}
