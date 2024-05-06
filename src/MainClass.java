import java.util.Random;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to RollDie, where you can roll a 6 sided dice ONLINE!");

        Scanner scanner = new Scanner(System.in);

            System.out.println("Roll dice? (y/n): ");
            String input = scanner.nextLine();
            if (input.equals("y")) {

                String[] diceMoves = {"1","2","3","4","5","6"};
                String randomRoll = diceMoves[new Random().nextInt(diceMoves.length)];
                System.out.println("The computer rolled a " + randomRoll);
            }

            else if(input.equals("n")) {
                System.out.println("Goodbye!");
            }

            else {
                System.out.println(input + " is an invalid response.");
            }

    }
}
