package Assignment11;

class Shape {

    int area() {
        return 0;
    }
}

class Rectangle extends Shape {

    int length;
    int breadth;

    @Override
    int area() {
        return length * breadth;
    }
}

public class Task2 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 4;
        r1.breadth = 5;

        System.out.println("Area: " + r1.area());
    }
}
