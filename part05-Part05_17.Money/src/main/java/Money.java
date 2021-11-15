
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros,
                this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if(this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        if (this.euros < compared.euros) {
            return true;
        }
        return false;

    }

    public Money minus(Money decreaser) {
        int euroDiff = this.euros-decreaser.euros;
        int centDiff = this.cents-decreaser.cents;
        int totalDiffInCents = euroDiff*100 + centDiff;

        if(totalDiffInCents <= 0){
            return new Money(0,0);
        }else{
            int eurosRtn = totalDiffInCents/100;
            int centRtn = totalDiffInCents%100;
            return new Money(eurosRtn, centRtn);
        }


    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
