public class DocComments {
    public static void main(String[] args) {

    }

    /**
     * THIS DOC COMMENTS
     * Function name :greet
     * inside the function:
     * 1. print:"Hi"
     */

    public static void greet() {
        System.out.println("Hi!");
    }

    /**
     * Function Name:printText
     * 
     * @param name (String)
     * @param age  (String)
     *             Inside Function:
     *             1.print:"The name and age as a part of text."
     */
    public static void printText(String name, String age) {
        System.out.println("Hi I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function Name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return (double)
     * 
     *         Inside the function:
     *         1.calculate the area and return it.
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}
