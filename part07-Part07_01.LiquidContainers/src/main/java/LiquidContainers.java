import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int containerOne = 0;
        int containerTwo = 0;
        int maxAmount = 100;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + containerOne + "/" + maxAmount);
            System.out.println("Second: " + containerTwo + "/" + maxAmount);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] splittingInput = input.split(" ");
            String command = splittingInput[0];
            int amount = Integer.parseInt(splittingInput[1]);

            if (command.equals("add")) {
                if (containerOne + amount <= maxAmount && amount > 0) {
                    containerOne += amount;
                } else if (containerOne + amount > maxAmount) {
                    containerOne = maxAmount;
                }
            } else if (command.equals("move")) {
                if (containerOne >= amount) {
                    containerOne -= amount;
                    containerTwo += amount;

                    if (containerTwo > 100) {
                        containerTwo = 100;
                    }
                } else if (amount > containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;

                    if (containerTwo > 100) {
                        containerTwo = 100;
                    }
                }
            } else if (command.equals("remove")) {
                if (containerTwo - amount < 0) {
                    containerTwo = 0;
                } else if (containerTwo - amount > 0) {
                    containerTwo -= amount;
                }
            }

        }


    }

}
