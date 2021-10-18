import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.println("\nUser Input and IFs\n");
        System.out.println("CPU: What's your name?");
        System.out.print("You: ");

        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        //userInput.close();

        System.out.printf("CPU: Hey %s, what's the temperature there?\n", name);
        System.out.print("You: ");

        //Scanner tempInput = new Scanner(System.in);
        int temperature = userInput.nextInt();
        //userInput.close();

        if (temperature >= 18) {
            System.out.println("CPU: Wow, that's pretty hot!");
            System.out.println("CPU: Do you have beer?");
            System.out.print("You: ");

            //Scanner beerInput = new Scanner(System.in);
            String beer = userInput.next().toLowerCase();
//            userInput.close();

            if (beer.equals("yes")) {
                System.out.println("CPU: Well, what you waiting for man, get it down you!");
            }
            else {
                System.out.println("CPU: Aww, well at least the sun's out");
            }
        }
        else {
            System.out.println("CPU: Cool, cool");
            System.out.println("CPU: You got any beer?");
            System.out.print("You: ");

            //Scanner beerInput = new Scanner(System.in);
            String beer = userInput.next().toLowerCase();
           // userInput.close();

            if (beer.equals("yes")) {
                System.out.println("CPU: May as well have a beer then, eh?");
            }
            else {
                System.out.println("CPU: Aww well, best get to the shops then");
            }
        }

        System.out.println("\nelse if\n");
        String tempLevel = null;

        if (temperature >= 25) {
            tempLevel = "Roasting";
        }
        else if (temperature >= 20) {
            tempLevel = "Pretty Hot";
        }
        else if (temperature >= 18) {
            tempLevel = "Hot";
        }
        else if (temperature >= 15) {
            tempLevel = "Comfortable";
        }
        else {
            tempLevel = "Cold";
        }

        System.out.println("CPU: It's " + tempLevel + " out there!");

        //if-else statements can also be made more concise by using '?' for if and ':' for else
        System.out.println("\nContracted if-else\n");
       tempLevel = (temperature >= 25) ? "Roasting"
               : (temperature >= 20) ? "Pretty Hot"
               : (temperature >= 18) ? "Hot"
               : (temperature >= 15) ? "Comfortable" : "Cold";

        System.out.println("Temperature is " + tempLevel);

        System.out.println("Using For loops");

        System.out.print("Number of repeats: ");
        int count = userInput.nextInt();

        for(int i = 0; i < count; i++){
            System.out.printf("\nMessage %d: Welcome to Java programming!", i + 1);
        }
    }
}
