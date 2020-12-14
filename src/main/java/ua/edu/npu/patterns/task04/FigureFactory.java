package ua.edu.npu.patterns.task04;

public class FigureFactory {

    public TetrisFigure getFigure (Integer figureType) {
        if (figureType == null)
            return null;
        TetrisFigure fig = null;
        switch (figureType) {
            case 1:
                fig = new ua.edu.npu.patterns.task04.figures.IFig();
                break;
            case 2:
                fig = new ua.edu.npu.patterns.task04.figures.JFig();
                break;
            case 3:
                fig = new ua.edu.npu.patterns.task04.figures.LFig();
                break;
            case 4:
                fig = new ua.edu.npu.patterns.task04.figures.OFig();
                break;
            case 5:
                fig = new ua.edu.npu.patterns.task04.figures.SFig();
                break;
            case 6:
                fig = new ua.edu.npu.patterns.task04.figures.TFig();
                break;
            case 7:
                fig = new ua.edu.npu.patterns.task04.figures.ZFig();
                break;
        }
        return fig;
    }
}
