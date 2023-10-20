public class HighScores {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        int[] storeNum = { random(), random(), random(), random(), random(), random(), random(),
                random(), random(), random() };
        System.out.print("Here are the scores: ");
        for (int i = 0; i < storeNum.length; i++) {
            System.out.print(storeNum[i] + " ");
            if (highScore < storeNum[i]) {
                highScore = storeNum[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int random() {
        double randomNum = Math.random() * 49999;
        int randomNumber = (int) randomNum;
        return randomNumber;
    }

}
