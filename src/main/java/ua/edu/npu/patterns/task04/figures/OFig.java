package ua.edu.npu.patterns.task04.figures;

import java.util.Random;

public class OFig implements ua.edu.npu.patterns.task04.TetrisFigure {

    public OFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating O-Figure");
        }
        else {
            System.out.println("Creating SUPER O-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
