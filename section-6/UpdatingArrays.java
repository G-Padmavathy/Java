import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] cafe = { "Cappacino", "Expresso", "Macchiato" };
        cafe[0] = "Iced Coffee";
        String menu = Arrays.toString(cafe);
        System.out.println(menu);

        // Increase Array size
        String[] newCafe = new String[5];
        for (int i = 0; i < cafe.length; i++) {
            newCafe[i] = cafe[i];
        }
        newCafe[3] = "House blend";
        newCafe[4] = "Dark roast";
        System.out.println(Arrays.toString(newCafe));

    }
}