
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);

        matthewsAccount.withdrawal(100.00);
        myAcc.deposit(100.00);

        System.out.println(matthewsAccount);
        System.out.println(myAcc);

    }
}
