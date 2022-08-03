package oops2.inheritance;

class BankAccount {

    int balance;
    String accountHolderName;
    int accountNo;

    void credit(int val) {
        balance = balance + val;
    }

    void debit(int val) {
        balance = balance - val;
    }
}