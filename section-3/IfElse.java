public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (chemistryGrade < biologyGrade) {
            System.out.println("Yes, you did, congrats!");
        } else {
            System.out.println("No, you did not :( keep try..");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if (sales > costs) {
            System.out.println("Congrats, you're rich!");
        } else {
            System.out.println("Not this time.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature <= targetTemperature) {
            System.out.println("Yes it is. The temperature is coler than usual.");
        } else {
            System.out.println("No, it is not! ");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed <= speedLimit) {
            System.out.println("Yes.you follow the drive limit");
        } else {
            System.out.println("No. you should must obey the rules.");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if (age >= retirementAge) {
            System.out.println("Enjoy your pension!");
        } else {
            System.out.println("You still have to work " + (retirementAge - age) + " years.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("yes. you will did the exam well.keep it up");
            ;
        } else {
            System.out.println("No.you will work hard ..");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if (thirdWord.equals(fourthWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
