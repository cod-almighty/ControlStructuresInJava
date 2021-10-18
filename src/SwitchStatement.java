import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.println("\nSwitch-Case Statements\n");
        System.out.print("Enter a day index : ");
        Scanner dayScanner = new Scanner(System.in);
        int dayIndex = dayScanner.nextInt();
        dayScanner.close();

        switch (dayIndex) {
            case 1:
                System.out.println("Day : Sunday");
                break; // if break isn't used, the program will continue to print each statement after the matched case

            case 2:
                System.out.println("Day : Monday");
                break;

            case 3:
                System.out.println("Day : Tuesday");
                break;

            case 4:
                System.out.println("Day : Wednesday");
                break;

            case 5:
                System.out.println("Day : Thursday");
                break;

            case 6:
                System.out.println("Day : Friday");
                break;

            case 7:
                System.out.println("Day : Saturday");
                break;

            default:
                System.out.println("There are only 7 days in a week dum-dum!");
                break;
        }
    }
}
