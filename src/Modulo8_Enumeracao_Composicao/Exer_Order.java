package Modulo8_Enumeracao_Composicao;

import Modulo8_Enumeracao_Composicao.entities.Client;
import Modulo8_Enumeracao_Composicao.entities.OrderItem;
import Modulo8_Enumeracao_Composicao.entities.Order_exer2;
import Modulo8_Enumeracao_Composicao.entities.Product;
import Modulo8_Enumeracao_Composicao.entities.enums.OrderStatus;
import Modulo8_Enumeracao_Composicao.entities.enums.Order_Status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Exer_Order {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = sdf2.parse(sc.next());

        Client client = new Client(name, email, birth);

        System.out.println("");
        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String status = sc.next();

        Date moment =  new Date();

        Order_exer2 order = new Order_exer2(moment, client, Order_Status.valueOf(status));

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.println("Enter #" + i + " item data:");

            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, new Product(productName, productPrice), productPrice);
            order.addItem(orderItem);
        }

        System.out.println(order);


        sc.close();
    }
}
