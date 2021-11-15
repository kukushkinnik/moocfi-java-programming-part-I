import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();

        while(true) {
            System.out.print("Title:");
            String title = scanner.nextLine();

            if(title.equals("")) {
                break;
            }

            System.out.print("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            listOfBooks.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String whatToPrint = scanner.nextLine();

        if(whatToPrint.equals("name")) {
            for (Book book : listOfBooks) {
                System.out.println(book.getTitle());
            }
        } else {
            for (Book book : listOfBooks) {
                System.out.println(book);
            }
        }



    }
}
