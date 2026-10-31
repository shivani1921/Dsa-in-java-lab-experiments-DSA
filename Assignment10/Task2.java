package Assignment10;

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    Student(String name) {
        super(name);
    }
}

public class Task2 {

    public static void main(String[] args) {

        Student s1 = new Student("Neha");

        System.out.println("Name: " + s1.name);
    }
}