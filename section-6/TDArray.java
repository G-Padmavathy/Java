import java.util.Arrays;

public class TDArray {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        int[][] grade = {
                { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }
        };
        grades[0][0] = 99;
        grades[0][1] = 89;
        grades[0][2] = 97;
        grades[0][3] = 95;

        grades[1][0] = 93;
        grades[1][1] = 89;
        grades[1][2] = 88;
        grades[1][3] = 91;

        grades[2][0] = 94;
        grades[2][1] = 85;
        grades[2][2] = 75;
        grades[2][3] = 99;

        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]) + "\n");
        System.out.println(Arrays.toString(grade[0]));
        System.out.println(Arrays.toString(grade[1]));
        System.out.println(Arrays.toString(grade[2]));

        String[][] table = new String[3][2];

        System.out.println(table.length);
        System.out.println(table[0].length);
        System.out.println(table[1].length);

    }

}
