package ro.fasttrackit.curs7.homework;

public class MainPerson {
    public static void main(String[] args) {
        Person singlePerson = new Person("Arthur", 23, false);
        System.out.print(singlePerson.getName() +" are " +singlePerson.getAge()+" ani "+" si este ");
        singlePerson.isMarried();

        Person childPerson = new Person("Johnny", 14);
        System.out.print(childPerson.getName()+" are " +childPerson.getAge()+" ani "+" si este ");
        childPerson.isMarried();

        Person marriedPerson = new Person("Andrei", 28, true);
        System.out.print(marriedPerson.getName()+" are " +marriedPerson.getAge()+" ani "+" si este ");
        marriedPerson.isMarried();

    }
}
