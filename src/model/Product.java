package model;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double calculateDiscount() {
        return 0;
    }

    public void displayDetails() {
        System.out.println("===== Product Details =====");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: %.2f \n", price);
        System.out.printf("Discount: %.2f \n", calculateDiscount());
        System.out.printf("Final Price: %.2f \n", getPrice() - calculateDiscount());

    }

    public double getPrice() {
        return price;
    }
}
