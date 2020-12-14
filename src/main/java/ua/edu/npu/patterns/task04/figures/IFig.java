package ua.edu.npu.patterns.task04.figures;

import java.util.Random;

public class IFig implements ua.edu.npu.patterns.task04.TetrisFigure {

    public IFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating I-Figure");
        }
        else {
            System.out.println("Creating SUPER I-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
