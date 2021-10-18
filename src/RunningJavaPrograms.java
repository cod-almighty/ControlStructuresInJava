import java.util.Arrays;

public class RunningJavaPrograms {

    public static void main(String[] args) {

        System.out.println("\nThe input args are: " + Arrays.toString(args));

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

        String item = args[0]; // item = the first argument supplied
        int searchLimit = Math.min(Integer.valueOf(args[1]), treasureChest.length);
            //Math.min is used to choose whichever value is lowest from the 2nd argument supplied or the length of the array
        boolean itemFound = false;

        System.out.printf("\nLet's see if we can find a %s in the first %d items", item, searchLimit);

        for (int i = 0; i < searchLimit ; i++) {
            if(treasureChest[i].equals(item)){
                System.out.printf("\nI found a %s, YAY!", item);
                itemFound = true;
                break; //break will exit the for loop
            }

            System.out.printf("\n%s isn't a %s. Let's keep looking...", treasureChest[i], item);
        }

        if (itemFound){
            System.out.printf("\n\nWell done, you found a %s!\n", item);
        }
        else {
            System.out.println("\n\nAww, better luck next time :(\n");
        }
    }
}
