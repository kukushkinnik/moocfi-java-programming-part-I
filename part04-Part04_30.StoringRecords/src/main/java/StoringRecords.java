
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

       try (Scanner reader = new Scanner(Paths.get(file))) {
           while (reader.hasNextLine()) {
               String line = reader.nextLine();
               String[] person = line.split(",");

               String name = person[0];
               int age = Integer.parseInt(person[1]);

               persons.add(new Person(name, age));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
        return persons;

    }
}
