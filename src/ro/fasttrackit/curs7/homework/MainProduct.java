package ro.fasttrackit.curs7.homework;

public class MainProduct {
    public static void main(String[] args) {
        System.out.println("---Primul produs---");
        Product produs = new Product("laptop", 1350, 3, "electronice");
        System.out.println("Nume produs - " + produs.getName() + ", pret " + produs.getPrice() + ",cantitate " + produs.getQuantity() + ", categorie " + produs.getCategory());
        System.out.println("Este produsul pe stoc? \n" + produs.hasStock());
        System.out.println("Apartine produsul categoriei \"electronice\"? \n" + produs.isCategory("electronice"));

        System.out.println("---Al doilea produs---");
        Product produsAlimentar = new Product("paine", 5, 90, "alimentare");
        System.out.println("Produsul face parte din categoria: " + produsAlimentar.getCategory());
        System.out.println("Este produsul " + produsAlimentar.getName() + " pe stoc? \n" + produsAlimentar.hasStock());
        System.out.println("Apartine painea categoriei \"electronice\"? \n" + produsAlimentar.isCategory("electronice"));

        System.out.println("---Al treilea produs---");
        Product parfum = new Product("Lancome", 155.2, 0, "cosmetice");
        System.out.println(parfum.getName() + " apartine categoriei " + parfum.getCategory());
        System.out.println("Este produsul pe stoc? \n" + parfum.hasStock());


    }
}
