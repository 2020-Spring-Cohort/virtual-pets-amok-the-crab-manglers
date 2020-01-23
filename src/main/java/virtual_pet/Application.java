package virtual_pet;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        System.out.println(" _________________________________________");
        System.out.println("|                                         |");
        System.out.println("|        Welcome to the crab zone!        |");
        System.out.println("| The water tank has two crabs which are: |");
        System.out.println("|             "+ shelter.pets.keySet() + "              |");
        System.out.println("|_________________________________________|");
        System.out.println("Please select your pet C for Cyborg and O for Organic");

        }
    }