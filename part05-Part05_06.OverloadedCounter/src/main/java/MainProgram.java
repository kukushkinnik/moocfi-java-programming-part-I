
public class MainProgram {

    public static void main(String[] args) {
        Counter counterOne = new Counter();
        Counter counterTwo = new Counter(5);

        counterOne.increase();
        counterOne.increase(5);

        counterTwo.increase(10);
        counterTwo.decrease();

        System.out.println(counterOne.value());
        System.out.println(counterTwo.value());
    }
}
