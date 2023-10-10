public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy,
        // snowy)
        // Decide whether to use if-else or switch
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt.");
                break;
            case "cloudy":
                System.out.println("You should wear a sweater.");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat.");
                break;
            case "snowy":
                System.out.println("You should wear a jacket.");
                break;
            default:
                System.out.println("you can wear whatever you want.");
        }

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("You are an admin.");
                break;
            case 2:
                System.out.println("You are an editor.");
                break;
            case 3:
                System.out.println("You are an user.");
                break;
            default:
                System.out.println("Please contact HR.");
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3:
        // user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid\n");
        } else if (temperature >= 80) {
            System.out.println("Its too hot\n");
        } else if (temperature >= 60 && humidity >= 60) {
            System.out.println("Its too cold and humid");
        } else if (temperature <= 60) {
            System.out.println("It's too cold");
        } else {
            System.out.println("It's comfortable");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too
        // hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("congratulations! you are eligible for cerdit card");
        } else {
            System.out.println("Sorry,you are not eligible for the cerdit card");
        }
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go!");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("power off");
        }
        // Determine what action to take based on the traffic light color (e.g., green,
        // yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        if (grade >= 80) {
            System.out.println("you got an A Grade");
        } else if (grade >= 70) {
            System.out.println("You got an B Grade.");
        } else if (grade >= 60) {
            System.out.println("You got an C Grade.");
        } else if (grade >= 50) {
            System.out.println("You got an D Grade.");
        } else {
            System.out.println("Failed :)");
        }

        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Enjoy your chrome extensions.");
                break;
            case "Firefox":
                System.out.println("The best nonprofit browser.");
                break;
            case "Safari":
                System.out.println("I see you're a proud Apple user.");
                break;
            case "Edge":
                System.out.println("Curious?What browers do you use?.");
                break;
            case "opera":
                System.out.println("Enjoy your opera extensions..");
                break;
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge,
        // or Opera
        // Decide whether to use if-else or switch

    }
}
