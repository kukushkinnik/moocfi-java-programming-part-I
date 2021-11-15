import java.util.Scanner;

public class UserInterface {
    private Container containerOne;
    private Container containerTwo;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.containerOne = new Container();
        this.containerTwo = new Container();
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.containerOne);
            System.out.println("Second: " + this.containerTwo);

            String input = this.scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    containerOne.add(amount);
                    break;
                case "move":
                    containerTwo.add(Math.min(containerOne.contains(), amount));
                    containerOne.remove(amount);
                    break;
                case "remove":
                    containerTwo.remove(amount);
                    break;
            }
        }
    }
}
