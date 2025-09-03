package oop.ocp;

public class Ostrich implements Moveable{
    //Implements only Moveable, you know that Ostrich can't fly right?
    @Override
    public void move() {
        System.out.println("Ostrich sprint fast through Savanna.");
    }
}
