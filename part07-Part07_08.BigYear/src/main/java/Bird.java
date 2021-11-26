public class Bird {

    private String birdName;
    private String birdNameInLatin;
    private int observation;
    public Bird(){}

    public void setBirdName(String birdName) {
        this.birdName = birdName;
        this.observation = 0;
    }

    public void setBirdNameInLatin(String birdNameInLatin) {
        this.birdNameInLatin = birdNameInLatin;
    }

    public void increaseObesravation() {
        this.observation++;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getBirdNameInLatin() {
        return this.birdNameInLatin;
    }

    public int getObservation() {
        return this.observation;
    }
}
