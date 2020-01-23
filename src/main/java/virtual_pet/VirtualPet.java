package virtual_pet;

public class VirtualPet {
    private static final int DEFAULT_HUNGER = 0;
    private static final int DEFAULT_BORED = 0;
    private static final String DEFAULT_NAME = "";
    private static final String DEFAULT_TYPE = "NOTYPE";
    private static final String DEFAULT_STATUS = "unAdopted";
    private static final int DEFAULT_HEALTH = 100;

    private int health = DEFAULT_HEALTH;
    private int hunger = DEFAULT_HUNGER;
    private int bored = DEFAULT_BORED;
    public String name = DEFAULT_NAME;
    public String type = DEFAULT_TYPE;
    private String status = DEFAULT_STATUS;


    public VirtualPet(String name, String petType) {
        this.name = name;

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
        this.tick();
        if (this.getType().equalsIgnoreCase("Organic")){
            System.out.println("You fed " + this.getName());
        }else if(this.getType().equalsIgnoreCase("Cyborg")){
            System.out.println("You Oiled " + this.getName());
        }
        hunger -= 4;
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
        this.tick();
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
