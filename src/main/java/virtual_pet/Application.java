package virtual_pet;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    static Shelter shelter = new Shelter();

        public static void main(String[] args) {
            Shelter shelter = new Shelter();
            System.out.println(" _________________________________________");
            System.out.println("|                                         |");
            System.out.println("|        Welcome to the crab zone!        |");
            System.out.println("| The water tank has two crabs which are: |");
            System.out.println("|             "+ shelter.pets.keySet() + "              |");
            System.out.println("|_________________________________________|");

        shelter.listPets();
        String choice = input.nextLine();
        shelter.choosePet(choice);

       /* mainLoop(choice);*/
        }


   /* public static void mainLoop(String choice){
        shelter.pets.get(choice).tick();
    }*/


    }