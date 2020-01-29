package virtual_pet;

import java.util.HashMap;

public class VirtualPet {

    private int health = 100;
    private int hunger = 0;
    private int bored = 0;
    public String name;
    public String type = "NOTYPE";
    private boolean adopted = false;
    private HashMap<String, String> tricks;
    private boolean isAlive = true;

    public VirtualPet(String name, String petType, HashMap<String, String> tricks) {
        this.name = name.toUpperCase();

        if (petType.equalsIgnoreCase("C")) {
            this.type = "Cyborg";
        }
        if (petType.equalsIgnoreCase("O")) {
            this.type = "Organic";
        }
        this.tricks = tricks;

    }

    public void listTricks() {
        System.out.println(this.tricks.keySet());
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void feedOrOil() {
        if (this.getType().equalsIgnoreCase("Organic")) {
            System.out.println("You fed " + this.getName());
        } else if (this.getType().equalsIgnoreCase("Cyborg")) {
            System.out.println("You Oiled " + this.getName());
        }
        hunger -= 3;
        if (hunger < 0) {
            hunger = 0;
        }
        if (type.equals("Organic")) {
            System.out.println(getName() + " currently has a hunger of: " + hunger);
        } else {
            System.out.println(getName() + "currently has a oil need of: " + hunger);
        }

    }

    public int getBored() {
        return this.bored;
    }

    public void bored() {
        this.bored += 1;
        if (this.bored > 10) {
            this.bored = 10;
        }
    }

    public void activity() {
        this.bored -= 2;
        if (this.bored < 0) {
            this.bored = 0;
        }
    }


    public void hungry() {
        this.hunger += 1;
    }

    public void adopt() {
        this.adopted = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void tick() {
        this.bored();
        this.hungry();
        if (this.getHunger() >= 10) {
            this.health -= (5 + (this.getHunger() - 10));
        }
        if (this.getHealth() <= 0) {
            this.setAlive(false);
            System.out.println(this.name + " has starved to death, you scoundrel!");
        }

    }

    public void doTrick(String trickName) {
        this.activity();
        System.out.println(this.tricks.get(trickName));
    }

    public int getHealth() {
        return this.health;
    }

    public boolean getAdopted() {
        return this.adopted;
    }

    public void takeToVet() {
        int oldHealth = this.getHealth();
        this.setHealth(oldHealth + 20);
        if (this.getHealth() > 100) {
            this.setHealth(100);
        }

        System.out.println("You take " + this.getName() + " to the vet. His health increases from " + oldHealth + " to " +
                this.getHealth());
    }

    public void getRundown() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Hunger/Oil: " + hunger);
        System.out.println("Boredom: " + bored);
        System.out.println("Tricks: " + this.tricks.keySet());
    }
}
