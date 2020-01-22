package virtual_pet;

public class VirtualPet {
    private static final int DEFAULT_HUNGER = 10;
    private static final int DEFAULT_BORED = 0;
    private static final String DEFAULT_NAME = "";
    private static final String DEFAULT_TYPE = "NOTYPE";
    private static final String DEFAULT_STATUS = "unAdopted";

    private int hunger = DEFAULT_HUNGER;
    private int bored = DEFAULT_BORED;
    private String name = DEFAULT_NAME;
    private String type = DEFAULT_TYPE;
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

    public void feed() {
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
        this.bored -= 1;
        if (this.bored < 0) {
            this.bored = 0;
        }
    }
    public void adopt(){
        this.status = "Adopted";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
    }
}
