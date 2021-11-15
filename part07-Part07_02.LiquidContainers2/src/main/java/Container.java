public class Container {
    private int currentAmountOfLiqued;
    private int maxAmont;

    public Container() {
        this.currentAmountOfLiqued = 0;
        this.maxAmont = 100;
    }

    public int contains() {
        return currentAmountOfLiqued;
    }

    public void add(int amount) {
        if(this.currentAmountOfLiqued + amount <= 100 && amount > 0) {
            this.currentAmountOfLiqued += amount;
        } else if (this.currentAmountOfLiqued + amount > 100) {
            this.currentAmountOfLiqued = this.maxAmont;
        }
    }

    public void remove(int amount) {
        if(this.currentAmountOfLiqued - amount > 0) {
            this.currentAmountOfLiqued -= amount;
        } else if (this.currentAmountOfLiqued - amount < 0) {
            this.currentAmountOfLiqued = 0;
        }
    }

    public String toString() {
        return this.currentAmountOfLiqued + "/" + this.maxAmont;
    }


}
