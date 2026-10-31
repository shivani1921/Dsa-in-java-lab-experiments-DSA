package Assignment9;

class Box {

    int width;

    Box() {
        width = 10;
    }
}

public class Task1 {

    public static void main(String[] args) {

        Box b1 = new Box();

        System.out.println("Width: " + b1.width);
    }
}