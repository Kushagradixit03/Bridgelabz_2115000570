import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + this.orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " | Price: $" + product.getPrice());
        }
        double totalPrice = calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getOrderId() {
        return this.orderId;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(this.name + " placed an order with Order ID: " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println(this.name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

class EcommercePlatform {
    private List<Customer> customers;

    public EcommercePlatform() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showAllCustomers() {
        System.out.println("Customers in the platform:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        EcommercePlatform platform = new EcommercePlatform();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        platform.addCustomer(customer1);
        platform.addCustomer(customer2);

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);
        Product product3 = new Product("Headphones", 100);

        Order order1 = new Order(1, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2, customer2);
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        platform.showAllCustomers();

        customer1.showOrders();
        customer2.showOrders();
    }
}
