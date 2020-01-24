package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class Shelter {

    private int numberOfPets = 0;
    public Map<String, VirtualPet> pets = new HashMap<>();

    public Shelter() {
        VirtualPet bob = new VirtualPet("Bob", "O");
        VirtualPet charlie = new VirtualPet("Charlie", "C");
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




    public String listPets() {
        System.out.println("Make your choice..");
       return this.pets.keySet().toString();
    }

    public void choosePet(String choice) {
        System.out.println("You chose " + choice.toUpperCase() + "!");
        System.out.println("He is " + this.pets.get(choice.toUpperCase()).getType());
        this.pets.get(choice.toUpperCase()).adopt();
    }


}





