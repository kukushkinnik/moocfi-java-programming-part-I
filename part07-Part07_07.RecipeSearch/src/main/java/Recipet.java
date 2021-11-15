import java.util.ArrayList;

public class Recipet {
    private ArrayList<String> recipe;
    private static int line;

    public Recipet() {
        this.recipe = new ArrayList<>();
    }

//    public void addRecipe(String item) {
//        this.recipe.add(item);
//    }

    public void getRecipe(ArrayList<String>recipes) {
        for (int i = line; i < recipes.size(); i++) {
            if (recipes.get(i).isBlank() || line == recipes.size()) {
                line = i + 1;
                break;
            }
            this.recipe.add(recipes.get(i));
        }
    }

    public void printRecipe() {
        for(String item : this.recipe) {
            System.out.println(item);
        }
    }

    public String getName() {
        return this.recipe.get(0);
    }

    public String getTime() {
        return this.recipe.get(1);
    }
}
