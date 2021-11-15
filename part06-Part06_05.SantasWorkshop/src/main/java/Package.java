import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> listOfGifts;

    public Package() {
        this.listOfGifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        listOfGifts.add(gift);
    }

    public int totalWeight() {
        int sum = 0;
        for(Gift gift : listOfGifts) {
            sum += gift.getWeight();
        }
        return  sum;
    }
}

