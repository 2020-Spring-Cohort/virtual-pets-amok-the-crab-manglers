package virtual_pet;

public class Application {
    public static void main(String[] args) {
        VirtualPet bob = new VirtualPet("Bob", "C");
        VirtualPet charlie = new VirtualPet("Charlie", "O");

        Shelter shelter = new Shelter();
        shelter.addPet(bob);
        shelter.addPet(charlie);
        shelter.listPets();

    }


}
