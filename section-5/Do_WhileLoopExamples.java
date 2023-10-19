import java.util.Scanner;

public class Do_WhileLoopExamples {

    public static void main(String[] args) {
        int i = 1;
        // Example 1: Print numbers from 1 to 10
        // Do-while loop to print numbers from 1 to 10
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 10);

        // Example 1: Print Positive numbers using do-while loop
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            }

        } while (number <= 0);

        System.out.println("You entered a positive number: " + number);
    }

}
