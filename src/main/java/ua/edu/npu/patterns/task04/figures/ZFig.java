package ua.edu.npu.patterns.task04.figures;

import java.util.Random;

public class ZFig implements ua.edu.npu.patterns.task04.TetrisFigure {

    public ZFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating Z-Figure");
        }
        else {
            System.out.println("Creating SUPER Z-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
