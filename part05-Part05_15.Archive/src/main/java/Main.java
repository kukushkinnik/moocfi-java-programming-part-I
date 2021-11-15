
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> listOfItems = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if(identifier.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if(name.equals("")) {
                break;
            }

            Item item = new Item(identifier, name);

            if(!(listOfItems.contains(item))) {
                listOfItems.add(item);
            }



        }

        System.out.println("==Items==");
        for (Item item : listOfItems) {
            System.out.println(item);
        }




    }
}
