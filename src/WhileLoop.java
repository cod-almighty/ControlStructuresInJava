public class WhileLoop {

    public static void main(String[] args) {

        System.out.println("\nWhile Loops\n");
        System.out.println("\nFor loops are useful when you know how many iterations you want to perform");
        System.out.println("When you're not sure, a While loop can run until a condition is met\n");

        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver",
                "Gold", "Book", "Book",
                "Spoon", "Silver", "Gold"};

        String item = "Sword";
        boolean itemFound = false;

        int i = 0;

        while(!itemFound && i < treasureChest.length){

            if(treasureChest[i].equals(item)) {
                System.out.println("\nFound it!");
                itemFound = true;
                break;
            }

            System.out.printf("\n%s isn't a %s. Let's keep looking....", treasureChest[i], item);

            i++;
        }

        System.out.println("\nDid you find it? : " + itemFound);
    }
}
