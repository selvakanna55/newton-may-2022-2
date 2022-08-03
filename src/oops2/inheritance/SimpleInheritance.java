package oops2.inheritance;


public class SimpleInheritance {
    public static void main(String[] args) {
        SavingsBankAccount sb1 = new SavingsBankAccount();
        sb1.accountHolderName = "Varun";
        sb1.balance = 1000000;
        sb1.accountNo = 11223344;

        System.out.println(sb1.balance);
        sb1.credit(5000); // BankAccount
        System.out.println(sb1.balance);
        sb1.debit(5000); //BankAccount
        System.out.println(sb1.balance);
        sb1.depositIntrest();
        System.out.println(sb1.balance);




    }
}
