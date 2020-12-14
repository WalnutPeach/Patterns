package ua.edu.npu.patterns.task05;

public class Character {
    Behaviour behaviour;

    public void setBehaviour(Behaviour behaviour){
        this.behaviour = behaviour;
    }

    public void doActing(){
        behaviour.acting();
    }
}
