package ua.edu.npu.patterns.task04.figures;

import java.util.Random;

public class SFig implements ua.edu.npu.patterns.task04.TetrisFigure {

    public SFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating S-Figure");
        }
        else {
            System.out.println("Creating SUPER S-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
