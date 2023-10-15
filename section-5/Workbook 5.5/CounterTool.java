import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...\n");

        System.out.print("1. Pick a number to count by:");
        int step = scan.nextInt();
        System.out.print("2. Pick a number to start counting form:");
        int start = scan.nextInt();
        System.out.print("3. Pick a number to count to:");
        int stop = scan.nextInt();

        for (int i = start; stop >= i; i += step) {
            System.out.print(i + " ");
        }

        // See detailed instructions on Learn the Part.

        scan.close();
    }
}
