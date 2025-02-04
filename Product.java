public class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = (total * discount) / 100;
        return total - discountAmount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after Discount: " + calculateTotalPrice());
    }

    public static void processProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            product.displayProductDetails();
        } else {
            System.out.println("Not an instance of the Product class");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product(1, "Laptop", 100000, 2);
        Product prod2 = new Product(2, "Smartphone", 50000, 3);

        processProductDetails(prod1);
        processProductDetails(prod2);

        updateDiscount(15.0);

        System.out.println("Updated Product Details:");
        processProductDetails(prod1);
        processProductDetails(prod2);
    }
}
