import java.util.Random;
import java.util.Scanner;

public class Main {

    static int randNum;
    static int guess;
    static int attempts = 0;
    static String playAgain = "";
    static boolean replay = true;
    static String difficulty;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("Welcome to Mike's Number Guessing Game");
        System.out.println("**************************************");

        // DO WHILE LOOP WITH INPUT VERIFICATION

        do {

            System.out.print("Choose a difficulty (easy, medium, hard): ");
            difficulty = scanner.nextLine().toLowerCase();

            while(!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
                System.out.println("Invalid choice, please choose one of the three difficulties");
                System.out.print("Choose a difficulty (easy, medium, hard): ");
                difficulty = scanner.nextLine().toLowerCase();
            }

            switch (difficulty) {
                case "easy" -> easySpin();
                case "medium" -> mediumSpin();
                case "hard" -> hardSpin();
            }

            System.out.printf("It took you %d attempt(s) to guess the number\n", attempts);
            attempts = 0;

            playAgain = "";

            while(!playAgain.equals("yes") && !playAgain.equals("no")) {

                System.out.print("Do you wish to play? (yes, no): ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes")) {
                    replay = true;
                } else if (playAgain.equals("no")) {
                    replay = false;
                } else {
                    System.out.print("Invalid input! Must choose yes or no: ");
                }
            }


        }while(replay);

        System.out.println("--------------------------------------------------");
        System.out.println("Thank you for playing Mike's Number Guessing Game!");
        System.out.println("Check out my other projects ;)");

        scanner.close();
    }

    // EASY DIFFICULTY

    static void easySpin(){

        System.out.println("------------------------------------------------------");
        System.out.println("A number between 1-10 has been selected, take a guess!");
        randNum = random.nextInt(1, 11);

        do {

            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess > 10 || guess < 1){
                System.out.println("Invalid choice, you must guess between 1-10!");
                continue;
            }

            if(guess > randNum){
                System.out.println("The number is lower than your guess!");
            }
            else if(guess < randNum){
                System.out.println("The number is greater than your guess!");
            }
            else{
                System.out.println("Correct!");
            }

            attempts++;

        }
        while(guess != randNum);


    }

    // MEDIUM DIFFICULTY

    static void mediumSpin(){

        System.out.println("------------------------------------------------------");
        System.out.println("A number between 1-50 has been selected, take a guess!");
        randNum = random.nextInt(1, 51);

        do {

            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess > 50 || guess < 1){
                System.out.println("Invalid choice, you must guess between 1-50!");
                continue;
            }

            if(guess > randNum){
                System.out.println("The number is lower than your guess!");
            }
            else if(guess < randNum){
                System.out.println("The number is greater than your guess!");
            }
            else{
                System.out.println("Correct!");
            }

            attempts++;

        }
        while(guess != randNum);

    }

    // HARD DIFFICULTY

    static void hardSpin(){

        System.out.println("------------------------------------------------------");
        System.out.println("A number between 1-100 has been selected, take a guess!");
        randNum = random.nextInt(1, 101);

        do {

            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess > 100 || guess < 1){
                System.out.println("Invalid choice, you must guess between 1-100!");
                continue;
            }

            if(guess > randNum){
                System.out.println("The number is lower than your guess!");
            }
            else if(guess < randNum){
                System.out.println("The number is greater than your guess!");
            }
            else{
                System.out.println("Correct!");
            }

            attempts++;

        }
        while(guess != randNum);

    }

}