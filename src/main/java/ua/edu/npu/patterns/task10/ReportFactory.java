package ua.edu.npu.patterns.task10;

import java.util.LinkedList;
import java.util.List;

public class ReportFactory {
    private List<Report> accounting = new LinkedList<>();

    public ReportFactory() {
        for (int i=0; i<5; i++){
            accounting.add(new Report("Report-" + (i+1)));
        }
    }

    public Report getReport (String bacteryType, int bacteryAmount){
        for (Report rep: accounting) {
            if (!rep.isActive()) {
                rep.setProperties(bacteryType, bacteryAmount);
                return rep;
            }
        }
        return null;
    }
}
