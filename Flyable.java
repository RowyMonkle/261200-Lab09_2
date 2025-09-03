package oop.ocp;

public interface Flyable extends Moveable{
    //Flyable() extends from Movable() because not every sample class creatures can fly()
    //Also can avoiding error (if swap super and sub-interface that's may cause error...
    void fly();
}