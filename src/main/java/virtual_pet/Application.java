package virtual_pet;

public class Application {
    public static void main(String[] args) {


        Shelter shelter = new Shelter();

        shelter.listPets();
        shelter.choosePet("Bob");
    }


}
