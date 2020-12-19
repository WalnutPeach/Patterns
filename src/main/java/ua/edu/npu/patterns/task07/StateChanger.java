package ua.edu.npu.patterns.task07;

public class StateChanger {
    State state;

    public void setState(State state){
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Create){
            setState(new Revision());
        }
        else if(state instanceof Revision){
            setState(new Disagree());
        }
        else if(state instanceof Disagree){
            setState(new Revision());
            setState(new Agree());
        }
    }

    public void doAct(){
        state.doActivity();
    }
}
