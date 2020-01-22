package virtual_pet;

public class Application {

    public static void main(String[] args) {

        Shelter shelter = new Shelter();
        System.out.println(" _________________________________________");
        System.out.println("|                                         |");
        System.out.println("|        Welcome to the crab zone!        |");
        System.out.println("| The water tank has two crabs which are: |");
        System.out.println("|             "+ shelter.pets.keySet() + "              |");
        System.out.println("|_________________________________________|");

    }

}