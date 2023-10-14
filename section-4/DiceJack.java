import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();

        int roll2 = rollDice();

        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean fristResult = isLessThan1(num1, num2, num3);
        boolean secondResult = isHigherThan6(num1, num2, num3);

        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)) {
            System.out.println("You entered numbers outside the vaild range");
            System.exit(0);
        }
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDice = roll1 + roll2 + roll3;
        System.out.println("Your Sum:" + sumOfNumbers + "\nDice Sum:" + sumOfDice);

        if (userWon(sumOfNumbers, sumOfDice)) {
            System.out.println("Congratulation, you won!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

    }

    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);

    }

    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);

    }

    public static boolean userWon(int sumNumbers, int sumDicerolls) {
        return (sumNumbers > sumDicerolls && (sumNumbers - sumDicerolls) < 5);
    }

    public static int rollDice() {
        double ram = (Math.random() * 6) + 1;
        return (int) ram;
    }

}
