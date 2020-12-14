package ua.edu.npu.patterns.task01;

public class Addition implements Arithmetic {
    int x, y, c;

    public Addition(int x, int y, int c){
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public double compute() {
        return (x+y)*c;
    }

    public void print() {
        System.out.print("(" + x + " + " + y + ") * " + c);
    }
}
