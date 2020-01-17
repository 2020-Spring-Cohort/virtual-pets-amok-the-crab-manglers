package virtual_pet;

public class VirtualPet {
    private int hunger = 10;
    private int bored = 0;

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

    public int getBored() {
        return bored;
    }

    public void bored() {
        bored += 1;
        if (bored > 10) {
            bored = 10;
        }
    }

    public void activity() {
        bored -= 1;
        if (bored < 0) {
            bored = 0;
        }
    }
}
