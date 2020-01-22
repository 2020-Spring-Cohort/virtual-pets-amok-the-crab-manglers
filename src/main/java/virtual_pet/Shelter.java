package virtual_pet;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shelter {

    private static final int DEFAULT_PET_NUMBER = 0;

    private int numberOfPets = DEFAULT_PET_NUMBER;
    public Map<String, VirtualPet> pets = new HashMap<>();

    public Shelter() {
        VirtualPet bob = new VirtualPet("Bob", "C");
        VirtualPet charlie = new VirtualPet("Charlie", "O");
        this.addPet(bob);
        this.addPet(charlie);
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public void addPet(VirtualPet pet) {
        this.pets.put(pet.getName(), pet);
        this.setNumberOfPets(this.pets.size());
    }


    public Map<String, VirtualPet> getPets() {
        return pets;
    }

    public void listPets() {
        System.out.println("Choose between Bob (Organic) & Charlie (Cyborg)");
        System.out.println(pets.keySet());
    }

    public void choosePet(String choice) {
        System.out.println("You chose " + choice + "!");
        System.out.println("He is " + this.pets.get(choice).getType());
        this.pets.get(choice).setStatus("Adopted");
        this.pets.get(choice).tick();
    }


}





