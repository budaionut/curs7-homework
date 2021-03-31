package ro.fasttrackit.curs7.homework;

public class MainPerson {
    public static void main(String[] args) {
        Person singlePerson = new Person("Arthur", 23, false);
        System.out.println(singlePerson.getName() +" are " +singlePerson.getAge()+" ani ");
        System.out.println("Este casatorit? "+singlePerson.getMarried());

        Person childPerson = new Person("Johnny", 14);
        System.out.println(childPerson.getName()+" are " +childPerson.getAge()+" ani ");
        System.out.println("Este casatorit? "+childPerson.getMarried());

        Person marriedPerson = new Person("Andrei", 28, true);
        System.out.println(marriedPerson.getName()+" are " +marriedPerson.getAge()+" ani ");
        System.out.println("Este casatorit? "+marriedPerson.getMarried());

    }
}
