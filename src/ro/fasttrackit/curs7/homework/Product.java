package ro.fasttrackit.curs7.homework;

public class Product {
    String name;
    double price;
    int quantity;
    String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    String getCategory() {
        return category;
    }

    boolean hasStock() {
      return quantity>0;
    }

    boolean isCategory(String category) {
        boolean checkCategory=false;
        if (this.category.equals(category)){
            checkCategory=true;
        }
        return checkCategory;
    }
}
