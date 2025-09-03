package oop.ocp;

public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle walks among the seagulls.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high above the (Jack) Sparrow.");
    }
}
