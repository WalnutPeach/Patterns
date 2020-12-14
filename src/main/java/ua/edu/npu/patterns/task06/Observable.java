package ua.edu.npu.patterns.task06;

public interface Observable {
    void register(Observer obj);
    void notifyObservers();
}
