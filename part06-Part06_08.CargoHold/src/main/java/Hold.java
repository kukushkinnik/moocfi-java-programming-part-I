import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private  int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if( this.totalWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() +
                " suitcases (" + this.totalWeight + " kg" + ")";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
           suitcase.printItems();
        }
    }
}
