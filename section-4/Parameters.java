public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 4.2);// Aruguments
        calculateArea(3.3, 3.2);
        calculateArea(1.3, 2.5);

    }

    public static void calculateArea(double length, double width)// paramentes
    {
        System.out.println("Area of the rectangle is :" + length * width);
    }

}
