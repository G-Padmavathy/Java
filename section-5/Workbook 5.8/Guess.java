import java.util.Scanner;
import java.lang.Math;

public class Guess {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        // See Learn the Part for detailed instructions.
        double randomNumber = (Math.random() * 5);
        int random = (int) randomNumber;

        while (random != input) {
            System.out.print("Try gain:");
            input = scan.nextInt();

        }
        System.out.println("You got it!");

        scan.close();
    }

}
