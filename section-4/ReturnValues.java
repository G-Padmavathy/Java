public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateAreaAndPrintIt(2, 4);// Aruguments
        double area1 = calculateAreaAndPrintIt(3.3, 3.2);
        double area2 = calculateAreaAndPrintIt(1.3, 2.5);
        System.out.println("Area:" + area);
        System.out.println("Area:" + area1);
        System.out.println("Area:" + area2 + "\n");

        calculateAreaAndPrintIt(-5, 2.3);

        String explainEnglish = explainArea("English");
        String explainFrench = explainArea("French");
        String explainSpanish = explainArea("Spanish");
        String explainItalian = explainArea("Italian");

        System.out.println(explainEnglish);
        System.out.println(explainFrench);
        System.out.println(explainSpanish);
        System.out.println(explainItalian);

    }

    public static double calculateAreaAndPrintIt(double length, double width)// paramentes
    {
        if (length < 0 || width < 0) {
            System.out.println("INVAILD DIMENIONS");
            System.exit(0);
        }
        double area = length * width;
        return area;

    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language does not available";

        }
    }
    // English "Area equals length * width"

    // French "La surface est egale a la longueur * la largeur"

    // Spanish "area es igual a largo * ancho"

}
