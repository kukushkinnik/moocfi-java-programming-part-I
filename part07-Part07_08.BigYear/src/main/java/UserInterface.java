import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final BirdsList list;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.list = new BirdsList();
    }

    public void start() {
        while(true) {
            System.out.println("List of available commands: ");
            System.out.println("1.Add - adds a bird");
            System.out.println("2.Observation - adds an observation");
            System.out.println("3.All - prints all birds");
            System.out.println("4.One - prints one bird");
            System.out.println("5.Quit - ends the program");

            System.out.println();

            System.out.print("Enter desired command: ");
            String command = this.scanner.nextLine();

            System.out.println();

            if(command.equalsIgnoreCase("quit")) {
                break;
            }

            if(command.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();

                System.out.print("Name in Latin: ");
                String nameInLatin = this.scanner.nextLine();

                list.add(name, nameInLatin);

                System.out.println();
            }

            if (command.equalsIgnoreCase("all")) {
                list.all();
                System.out.println();
            }

            if (command.equalsIgnoreCase("one")) {
                System.out.println("Bird to find: ");
                String nameOfABird = this.scanner.nextLine();
                list.one(nameOfABird);
                System.out.println();
            }

            if(command.equalsIgnoreCase("observation")) {
                System.out.println("Bird to observe: ");
                String nameOfABird = this.scanner.nextLine();
                list.observe(nameOfABird);
                System.out.println();
            }
        }
    }
}
