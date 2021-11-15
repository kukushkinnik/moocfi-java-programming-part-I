import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {
    private ArrayList<String> listOfJokes;

    public JokeManager() {
        this.listOfJokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        listOfJokes.add(joke);
    }

    public String drawJoke() {
        if (listOfJokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(listOfJokes.size());
        return listOfJokes.get(index);
    }

    public void printJokes() {
        for (String joke : listOfJokes) {
            System.out.println(joke);
        }
    }

}

