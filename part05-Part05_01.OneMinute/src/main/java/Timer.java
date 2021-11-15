public class Timer {
    private ClockHand hundrethsOfSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundrethsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundrethsOfSeconds.advance();

        if(this.hundrethsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
    return this.seconds + ":" + this.hundrethsOfSeconds;
    }
}
