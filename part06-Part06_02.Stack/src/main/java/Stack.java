import java.util.ArrayList;

public class Stack {
    private ArrayList<String>stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String last = stack.get(stack.size() - 1);
        stack.remove(last);
        return last;
    }
}
