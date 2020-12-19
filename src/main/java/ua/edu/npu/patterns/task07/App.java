package ua.edu.npu.patterns.task07;

public class App {

    public static void main(String[] args) {
        State state = new Create();
        StateChanger stchng = new StateChanger();

        stchng.setState(state);
        for(int i=0; i<4; i++){
            stchng.doAct();
            stchng.changeState();
        }
    }
}
