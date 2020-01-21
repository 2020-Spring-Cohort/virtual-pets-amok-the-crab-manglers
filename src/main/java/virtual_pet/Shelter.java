package virtual_pet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shelter {

    private static final int DEFAULT_PET_NUMBER = 0;

    private int numberOfPets = DEFAULT_PET_NUMBER;
    private Map<String, VirtualPet> pets = new HashMap<>();

    public Shelter() {
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
        int count = 0;
        while (count < this.numberOfPets){
            String currentPet = this.pets.get(count).getName();
            System.out.println(pets.get(currentPet) + ", who is of type " + pets.get(currentPet).getType());
            count += 1;
        }

    }


}

