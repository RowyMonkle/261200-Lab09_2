package oop.ocp;

public class Sparrow implements Flyable{
    //interface Flyable() extends from interface Moveable(), so Sparrow() class can using it too
    @Override
    public void move() {
        System.out.println("Sparrow hops on the ground.");
    }

    @Override
    public void fly() {
        System.out.println("Look! The (Jack) Sparrow flies high in the sky.");
    }
}
