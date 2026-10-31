package Assignment11;

class Shape {

    int area() {
        return 0;
    }
}

class Square extends Shape {

    int side;

    @Override
    int area() {
        return side * side;
    }
}

public class Task1 {

    public static void main(String[] args) {

        Square s1 = new Square();

        s1.side = 4;

        System.out.println("Area: " + s1.area());
    }
}
