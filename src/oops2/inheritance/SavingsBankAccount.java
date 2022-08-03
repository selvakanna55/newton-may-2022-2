package oops2.inheritance;

class SavingsBankAccount extends BankAccount {

    int minimumBalance = 3000;
    double intrestRate = 4.5;

    void depositIntrest() {
        int amount = (int) (balance * (intrestRate / 100.0));
        credit(amount);
    }

    void checkMinimumBalanceIsPresent() {
        if (balance >= minimumBalance) {
            System.out.println("You have sufficient balance");
        } else {
            System.out.println("Please maintain the minimum balance, deposit INR " + (minimumBalance - balance));
        }
    }

}
