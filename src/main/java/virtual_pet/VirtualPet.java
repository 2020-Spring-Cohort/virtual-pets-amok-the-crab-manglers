package virtual_pet;

public class VirtualPet {
    private int hunger=10;

    public VirtualPet(String name) {

    }

    public String getName() {
        return "CRABORG";
    }

    public int getHunger() {
        return hunger;
    }

    public void feed() {
        hunger -= 3;
        if (hunger < 0) {
            hunger = 0;
        }
    }
}
