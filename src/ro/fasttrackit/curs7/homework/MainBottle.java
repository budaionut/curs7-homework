package ro.fasttrackit.curs7.homework;

public class MainBottle {
    public static void main(String[] args) {
        Bottle sticla = new Bottle(1000, 800, false);
        System.out.println("Has the bottle more liquid? \n" + sticla.hasMoreLiquid());
        System.out.println("Available liquid in the bottle is: \n" + sticla.availableLiquid);
        System.out.println("Is the bottle empty? \n" + sticla.isEmpty());

        sticla.openBottle();
        sticla.closeBottle();
        sticla.drinkLiquid(300);

        sticla.openBottle();
        sticla.drinkLiquid(700);
        sticla.drinkLiquid(200);
    }
}
