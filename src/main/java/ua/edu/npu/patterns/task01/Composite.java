package ua.edu.npu.patterns.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Arithmetic {
    private final List<Arithmetic> operations = new ArrayList<>();

    public Composite(Arithmetic... arithmetics){
        operations.addAll(Arrays.asList(arithmetics));
    }

    public double compute() {
        return operations.stream().mapToDouble(Arithmetic::compute).sum();
    }

    public void print() {

    }
}
