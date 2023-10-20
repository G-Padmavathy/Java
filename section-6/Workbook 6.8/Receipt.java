public class Receipt {
    public static void main(String[] args) {

        String[] Apple = { "Gala", "Granny Smith", "Macintosh" };
        double[] Price = { 1.99, 1.49, 1.29 };
        String appleName = "";
        double appleprice = 0;
        System.out.println("Here's your receipt:\n");
        for (int i = 0; i < Apple.length; i++) {
            appleName = Apple[i];
            for (int j = 0; j < Price.length; j++) {
                appleprice = Price[i];

            }
            System.out.println("\t" + appleName + ": $" + appleprice);
        }

        // See instructions on Learn the Part (Workbook 6.8)
        // to be used in for loop.
    }
}
