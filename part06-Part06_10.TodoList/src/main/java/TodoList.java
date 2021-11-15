import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add (String action) {
        this.list.add(action);

    }

    public void remove(int number) {
        list.remove(number - 1);


    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ": " + list.get(i));
        }
    }


}
