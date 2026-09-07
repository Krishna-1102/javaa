public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    void calculate() {
        double total = price * quantity;

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.productId = 101;
        p1.productName = "Laptop";
        p1.price = 40000;
        p1.quantity = 1;

        p1.calculate();
    }
}   