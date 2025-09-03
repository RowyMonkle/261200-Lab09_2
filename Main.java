package oop.ocp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Penguin pingu = new Penguin();      // Penguin can move but not fly
        Ostrich ozzy = new Ostrich();       // Ostrich can run but not fly
        Sparrow jackSparrow = new Sparrow();// Sparrow can move and fly
        Eagle eddie = new Eagle();          // Eagle can move and fly

        System.out.println("=== Moveable Birds ===");
        // test moveable
        pingu.move();
        ozzy.move();
        jackSparrow.move();
        eddie.move();

        System.out.println("\n=== Flyable Birds ===");
        // test flyable
        jackSparrow.fly();
        eddie.fly();
        pingu.fly(); // expect tobe unable to fly

        // LSP demo:
        // Treating Sparrow as Moveable is still valid
        Moveable sparrowAsMoveable = jackSparrow;
        sparrowAsMoveable.move(); // works without issue
    }
}