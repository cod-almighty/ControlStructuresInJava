import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.println("\nUser Input and IFs\n");
        System.out.println("CPU: What's your name?");
        System.out.print("You: ");

        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        nameInput.close();

        System.out.printf("CPU: Hey %s, what's the temperature there?\n", name);
        System.out.print("You: ");

        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();
        tempInput.close();

        if (temperature >= 18) {
            System.out.println("CPU: Wow, that's pretty hot!");
            System.out.println("CPU: Do you have beer?");
            System.out.print("You: ");

            Scanner beerInput = new Scanner(System.in);
            String beer = beerInput.next().toLowerCase();
            beerInput.close();

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

            Scanner beerInput = new Scanner(System.in);
            String beer = beerInput.next().toLowerCase();
            beerInput.close();

            if (beer.equals("yes")) {
                System.out.printf("CPU: May as well have a beer then, eh?");
            }
            else {
                System.out.println("CPU: Aww well, best get to the shops then");
            }
        }

    }
}
