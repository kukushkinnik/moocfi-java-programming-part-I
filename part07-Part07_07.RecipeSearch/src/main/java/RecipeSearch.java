
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");

        ArrayList<Recipet> recipets = new ArrayList<>();

        String file = scanner.nextLine();
        ArrayList<String> recipie = new ArrayList<>();
        File myFile = new File(file);
        int line = 0;


        try {
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                recipie.add(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Recipet recipet = new Recipet();

        recipet.getRecipe(recipie);


        Recipet recipet1 = new Recipet();
        recipet1.getRecipe(recipie);


        Recipet recipet2 = new Recipet();
        recipet2.getRecipe(recipie);

        recipets.add(recipet);
        recipets.add(recipet1);
        recipets.add(recipet2);

        for (Recipet recp : recipets) {
            recp.printRecipe();
        }


        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");


        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("list")) {
                System.out.println("Recipes: ");
                System.out.println(recipet.getName() + ", cooking time: " + recipet.getTime());
                System.out.println(recipet1.getName() + ", cooking time: " + recipet1.getTime());
                System.out.println(recipet2.getName() + ", cooking time: " + recipet2.getTime());
            }

            if(command.equals("stop")) {
                break;
            }
        }














    }

}
