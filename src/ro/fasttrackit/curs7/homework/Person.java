package ro.fasttrackit.curs7.homework;

public class Person {
    String name;
    int age;
    boolean married;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
        this.married=false;
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

    void isMarried(){
        if (married == false){
            System.out.println("necasatorit");
        } else {
            System.out.println("casatorit");
        }
    }
}
