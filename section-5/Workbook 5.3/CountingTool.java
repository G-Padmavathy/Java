import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.println("Hi Timmy! Choose a number to count to:");
        int countNumber = scan.nextInt();
        System.out.println("Great! Here's how it's done");
        for (int i = 0; countNumber >= i; i++) {// ;7>=0
            System.out.print(i + " ");
        }

        scan.close();
    }
}
