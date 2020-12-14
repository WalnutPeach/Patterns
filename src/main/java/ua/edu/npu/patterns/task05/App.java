package ua.edu.npu.patterns.task05;

public class App {
    public static void main(String[] args) {
        Character vamp = new Character();
        Character elf = new Character();
        Character troll = new Character();

        vamp.setBehaviour(new Vampire());
        elf.setBehaviour(new Elf());
        troll.setBehaviour(new Troll());

        vamp.doActing();
        elf.doActing();
        troll.doActing();
    }
}
