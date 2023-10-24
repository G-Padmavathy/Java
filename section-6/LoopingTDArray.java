public class LoopingTDArray {
    public static void main(String[] args) {
        int[][] grades = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < grades.length; i++) {
            // switch (i) {
            // case 0:
            // System.out.print("\tHarry: ");
            // break;
            // case 1:
            // System.out.print("\tRon: ");
            // break;
            // case 2:
            // System.out.print("\tHermione: ");
            // break;
            // }

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }

            System.out.println("\n");
        }
    }

}
