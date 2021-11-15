
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());

                if(number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e)  {
            System.out.println(e.getMessage());
        }

        System.out.println("Numbers: " + counter);
    }

}
