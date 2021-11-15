import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        label:
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            switch (command) {
                case "stop":
                    break label;
                case "add":
                    System.out.print("To add:");
                    String thingToDo = this.scanner.nextLine();
                    this.todoList.add(thingToDo);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed?");
                    int numberOfTask = Integer.parseInt(this.scanner.nextLine());
                    todoList.remove(numberOfTask);
                    break;
            }
        }

    }
}
