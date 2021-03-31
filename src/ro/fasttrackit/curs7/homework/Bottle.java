package ro.fasttrackit.curs7.homework;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Bottle {
    double totalCapacity;
    double availableLiquid;
    boolean open;

    public Bottle(double totalCapacity, double availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    boolean hasMoreLiquid() {
        boolean moreLiquid = false;
        if (availableLiquid > totalCapacity) {
            moreLiquid = true;
        }
        return moreLiquid;
    }

    double getAvailableLiquid() {
        return availableLiquid;
    }

    boolean isEmpty() {
        boolean empty = false;
        if (availableLiquid == 0) {
            empty = true;
        }
        return empty;
    }

    void openBottle() {
        if (open == false) {
            open = true;
            System.out.println("The bottle was opened");
        } else {
            System.out.println("The bottle was already opened");
        }
    }

    void closeBottle() {
        if (open == true) {
            open = false;
            System.out.println("The bottle was closed");
        } else {
            System.out.println("The bottle was already closed");
        }
    }

    void drinkLiquid(int liquid) {
        if (open == true) {
            if (availableLiquid >= liquid) {
                availableLiquid -= liquid;
                System.out.println("You drinked " + liquid + " from bottle and was remaining " + availableLiquid);
            } else {
                System.out.println("There is not sufficient liquid in the bottle");
            }
        } else {
            System.out.println("Can't drink because the bottle is closed");
        }
    }

}
