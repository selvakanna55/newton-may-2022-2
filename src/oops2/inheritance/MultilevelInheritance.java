package oops2.inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        JanDhanAccount j1 = new JanDhanAccount();
        System.out.println(j1.minimumBalance); // 0
        System.out.println(j1.balance);
        j1.credit(1000);
        System.out.println(j1.balance);
        j1.debit(100);
        System.out.println(j1.balance);
        j1.checkMinimumBalanceIsPresent();
    }
}

