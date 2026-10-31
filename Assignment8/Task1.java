package Assignment8;

class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

public class Task1 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.roll = 101;
        s1.name = "Rama";

        s1.show();
    }
}