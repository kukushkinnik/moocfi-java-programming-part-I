import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item>items;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if(this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }

    }

    @Override
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items " + "(" + this.totalWeight + " kg" + ")";
        }

        if (this.items.size() == 1) {
            return this.items.size () + " item " + "(" + this.totalWeight +" kg" + ")";
        }
        return this.items.size () + " items " + "(" + this.totalWeight +" kg" + ")";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg" + ")");
        }
    }

       public int totalWeight() {
           return this.totalWeight;
        }

        public Item heaviestItem() {
            if (items.isEmpty()) {
                return null;
            }

            Item heaviestItem = items.get(0);

            for(Item item : items) {
                if(heaviestItem.getWeight() < item.getWeight()) {
                    heaviestItem = item;
                }

            }
            return heaviestItem;
        }

    }




