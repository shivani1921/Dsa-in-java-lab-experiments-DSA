package Assignment10;

class Person {

    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {

}

public class Task3 {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.name = "Kiran";

        t1.greet();
    }
}