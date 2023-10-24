import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int[] numbers2 = numbers;
        numbers2[1] = 5;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        String[] staffLastYear = { "Tommy", "Doona", "Leo" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        // String[] staffThisYear = new String[3];
        // for (int i = 0; i < staffLastYear.length; i++) {
        // staffThisYear[i] = staffLastYear[i];
        // }

        staffThisYear[1] = "Sam";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
