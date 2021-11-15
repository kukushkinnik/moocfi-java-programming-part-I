import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void  start() {
        label:
        while(true) {
            System.out.print("Command:");
            String command = this.scanner.nextLine();

            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break label;
                case "add":
                    System.out.print("Word:");
                    String word = this.scanner.nextLine();

                    System.out.print("Translation:");
                    String translation = this.scanner.nextLine();
                    dictionary.add(word, translation);

                    break;
                case "search":
                    System.out.print("To be translated:");
                    String searchableWord = this.scanner.nextLine();
                    if (dictionary.translate(searchableWord) == null) {
                        System.out.println("Word " + searchableWord + " was not found");
                    } else {
                        System.out.println("Translation:" + dictionary.translate(searchableWord));
                    }

                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
