import model.Clothing;
import model.Electronics;
import model.Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Phone", 200, 3),
                new Electronics(2, "Laptop", 300, 2),
                new Electronics(3, "Headphone", 400, 5),
                new Clothing(4, "T-Shirt", 10, "XL"),
                new Clothing(5, "Jeans", 15, "M")
        };

        for(Product product : products) {
            product.displayDetails();
        }

    }
}
