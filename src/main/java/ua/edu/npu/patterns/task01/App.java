package ua.edu.npu.patterns.task01;

public class App {
    public static void main(String[] args) {
        Arithmetic a1 = new Addition(10, 25, 4);
        Arithmetic a2 = new Addition(3, 6, 52);
        a1.print();
        System.out.print(" + ");
        a2.print();
        System.out.println();
        Arithmetic res = new Composite(a1, a2);
        System.out.println("Result: " + res.compute());
    }
}
