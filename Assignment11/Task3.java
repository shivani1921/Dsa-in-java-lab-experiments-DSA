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

public class Task3 {

    public static void main(String[] args) {

        Shape s1 = new Square();

        Square sq = (Square) s1;
        sq.side = 3;

        System.out.println("Area: " + s1.area());
    }
}