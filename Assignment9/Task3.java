package Assignment9;

class Counter {

    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
}

public class Task3 {

    public static void main(String[] args) {

        Counter c1 = new Counter();

        c1.increment();
        c1.increment();
        c1.increment();

        System.out.println("Count: " + c1.count);
    }
}