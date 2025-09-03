package oop.lsp;

public class Penguin implements Moveable { //respects LSP
    @Override
    public void move() { //Penguin just movable, they can't fly.
        System.out.println("Penguin waddles on land and swims in water.");
    }

    // Extra method just for testing
    public void fly() {
        System.out.println("Sorry sir! Even though you have wings, you cannot fly.");
    }

}
