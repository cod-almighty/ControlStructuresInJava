import java.sql.SQLOutput;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("\nFor Loops");
        System.out.println("Using a For loop to iterate over arrays\n");

        String[] productName = {"Mouse", "Speakers", "Watch", "Earphones", "Charger"};
        double[] productPricesUSD = {9.90, 79.0, 110.0, 42.50, 55};
        double USDToEUR = 0.82;

        System.out.println("Product prices in USD and Euro");

        for (int i = 0; i < productPricesUSD.length ; i++) {
            System.out.printf("\nProduct %s costs %f USD or %f EUR",
                    productName[i],
                    productPricesUSD[i],
                    USDToEUR * productPricesUSD[i]);
        }

        System.out.println("\n\nWe can also do this in reverse order");

        for (int i = productPricesUSD.length - 1 ; i >= 0 ; i--) {

            System.out.printf("\nProduct %s costs %f USD or %f EUR",
            productName[i],
            productPricesUSD[i],
            USDToEUR * productPricesUSD[i]);
        }

        System.out.println("\n\nWe can also change the step from 1 to 2");

        for (int i = 0; i < productPricesUSD.length ; i += 2) {
            System.out.printf("\nProduct %s costs %f USD or %f EUR",
                    productName[i],
                    productPricesUSD[i],
                    USDToEUR * productPricesUSD[i]);
        }
        System.out.println("\n\nIf the step argument is missed, it will result in an infinite loop, oh no!!");
        System.out.println("Don't do that, whatever you do");

        System.out.println();
        System.out.println("\nFor loops can also be nested\n");

        String[] brands = {"Raganza", "Qenel", "Zoflina"};

        System.out.println("Products in the catalog:");

        for (int i = 0; i < productName.length ; i++) {
            for (int j = 0; j < brands.length; j++){
                System.out.println(brands[j] + " " + productName[i]);
            }
        }

        System.out.println("\nSearching arrays with a For and If\n");

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

        int usefulItemsCount = 0;

        System.out.println("Let the search begin!\n");

        for (int i = 0; i < treasureChest.length ; i++){

            if(treasureChest[i].equals("Gold")){
                System.out.println("I found some GOLD!");
                usefulItemsCount++;
            }
        }
        System.out.printf("I found %d bars of gold. Woot-Woot!!", usefulItemsCount);

        System.out.println("\nNow we'll do the same again for Gold and Silver using Continue\n");

        usefulItemsCount = 0;
        for (int i = 0; i < treasureChest.length ; i++) {
            if(!(treasureChest[i].equals("Gold") || treasureChest[i].equals("Silver"))){
                System.out.printf("\n%s isn't useful. Moving along...", treasureChest[i]);
                continue; //continue moves to the next iteration without going any further in the for loop
            }

            System.out.printf("\nLook, I found some %s! That's useful", treasureChest[i].toUpperCase());
            usefulItemsCount++;
        }

        System.out.printf("\n\nI found %d bars of gold and silver. Yass!!", usefulItemsCount);

        System.out.println("\n\nNow we'll look for one item");

        String item = "Document";
        boolean itemFound = false;

        System.out.printf("Let's see if we can find a %s", item);

        for (int i = 0; i < treasureChest.length ; i++) {
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
