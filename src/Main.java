import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // TODO: ADD DIFFICULTIES (EASY, MEDIUM HARD)

        // 0-10 should be easy difficulty

        System.out.println("Welcome to Mike's Number Guessing Game");

        int randNum;
        int guess;
        int attempts = 1;
        String playAgain = "";
        boolean replay = true;

        do {

            System.out.println("A number between 0-10 has been selected, take a guess!");
            randNum = random.nextInt(11);
            guess = scanner.nextInt();
            scanner.nextLine();

            while(guess != randNum){
                System.out.println("Wrong, try again!");
                System.out.println("Try again!");
                guess = scanner.nextInt();
                scanner.nextLine();
                attempts++;
            }

            System.out.println("Correct!");
            System.out.println("It took you " + attempts + " attempt(s) to guess the number");
            attempts = 1;

            playAgain = "";

            while(!playAgain.equals("yes") && !playAgain.equals("no")) {

                System.out.print("Do you wish to play? (yes, no): ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes")) {
                    replay = true;
                    break;
                } else if (playAgain.equals("no")) {
                    replay = false;
                    break;
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
}