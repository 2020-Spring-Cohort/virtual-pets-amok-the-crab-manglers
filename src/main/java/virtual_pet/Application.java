package virtual_pet;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    static Shelter shelter = new Shelter();

    public static void crabDoesTrick(String petChoice){
        Scanner trickSelection = new Scanner(System.in);
        System.out.println(shelter.pets.get(petChoice).getName() +
                " can do the following tricks: ");
        shelter.pets.get(petChoice).listTricks();
        System.out.println("Please type the name of the trick you would like him to do.");
        shelter.pets.get(petChoice).doTrick(trickSelection.nextLine().toUpperCase());
    }

    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        System.out.println(" _________________________________________");
        System.out.println("|                                         |");
        System.out.println("|        Welcome to the crab zone!        |");
        System.out.println("| The water tank has two crabs which are: |");
        System.out.println("|             " + shelter.pets.keySet() + "              |");
        System.out.println("|_________________________________________|");

        System.out.println(shelter.listPets());
        String choice = input.nextLine().toUpperCase();
        shelter.choosePet(choice);

        System.out.println("Welcome to your new virtual " + shelter.pets.get(choice).getType() +
                " crab, " + shelter.pets.get(choice).getName() + "!");

        mainLoop(choice);
    }


    public static void mainLoop(String choice) {
        shelter.pets.get(choice).tick();
        String newChoice = choice.toUpperCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make your selection: \n0: Display stats\n1: Do a trick\n" +
                "2: Feed or oil your pet\n3: Take " + shelter.pets.get(choice).getName() +
                " to the vet\n4: Pet your crab\n5: Return your pet to the shelter\n6: Exit game");
        int userSelection = scanner.nextInt();

        if (!shelter.pets.get(choice).isAlive()){
            System.out.println("Oh my gosh! You killed " + shelter.pets.get(choice).getName() + "!" +
                    " You b@$#^#d! You allowed him to literally STARVE TO DEATH you despicable human being!\n" +
                    "How dare you treat your precious virtual pet this way! You are worse than Stalin!");
            userSelection = 6;
        }

        switch(userSelection){
            case 0 :
                shelter.pets.get(choice).getRundown();
                break;
            case 1 :
                crabDoesTrick(choice);
                break;
            case 2 :
                shelter.pets.get(choice).feedOrOil();
                break;
            case 3 :
                shelter.pets.get(choice).takeToVet();
                break;
            case 4 :
                System.out.println(shelter.pets.get(choice).getName() + " chitters happily and pinches the crap out of your finger.");
                break;
            case 5:
                Scanner newPet = new Scanner(System.in);
                System.out.println("You return " + shelter.pets.get(choice).getName() + " to the shelter. The following pets are available:");
                System.out.println(shelter.listPets());
                System.out.println("Please type the name of the pet you want to adopt now.");
                newChoice = newPet.next();
                shelter.choosePet(newChoice.toUpperCase());
                break;
        }
    if (userSelection != 6){
        mainLoop(newChoice.toUpperCase());
    }

    }


            }