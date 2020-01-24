package virtual_pet;

public class VirtualPet {

    private int health = 100;
    private int hunger = 0;
    private int bored = 0;
    public String name = "";
    public String type = "NOTYPE";
    private String status = "unAdopted";


    public VirtualPet(String name, String petType) {
        this.name = name.toUpperCase();

        if (petType.equalsIgnoreCase("C")) {
            this.type = "Cyborg";
        }
        if (petType.equalsIgnoreCase("O")) {
            this.type = "Organic";
        }

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return this.name;
    }

    public int getHunger() {
        return hunger;
    }

    public void feedOrOil() {
        if (this.getType().equalsIgnoreCase("Organic")){
            System.out.println("You fed " + this.getName());
        }else if(this.getType().equalsIgnoreCase("Cyborg")){
            System.out.println("You Oiled " + this.getName());
        }
        hunger -= 3;
        if (hunger < 0) {
            hunger = 0;
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
        this.status = "Adopted";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    public void tick() {
            this.bored();
            this.hungry();
            if (this.getHunger() == 10) {
                this.health -= 5;
            }

    }

    public int getHealth() {
        return this.health;
    }
}
