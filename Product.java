public class Product{

    private String productName;
    private double price;
    
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("\nTotal Products : " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 100000);
        Product product2 = new Product("Smartphone", 80000);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
