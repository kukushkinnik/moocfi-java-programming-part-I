
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String elementsInList = "";
        int i = 0;
        for (String element : elements) {
            if (i < elements.size() - 1) {
                elementsInList += element + "\n";
            } else {
                elementsInList += element;
            }
            i++;
        }

        String printOutput = "The collection " + this.name + " has " + elements.size() + " elements:" +"\n" + elementsInList;

        if (elements.size() == 1) {
           return "The collection " + this.name + " has " + elements.size() + " element:" +"\n" + elementsInList;

        }
       return printOutput;
    }
    
}
