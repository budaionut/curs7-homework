package ro.fasttrackit.curs7.homework;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.married = false;
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    boolean getMarried() {
        return married;
    }
}
