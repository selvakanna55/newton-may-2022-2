package oops2.inheritance;

import java.util.ArrayList;

public class DematAccount extends BankAccount {
    int dailyTradeLimit = 22000;
    ArrayList<String> invested;

    void addNewInvestment(String company, int amount) {
        invested.add(company);
        debit(amount);
    }

    DematAccount() {
        invested = new ArrayList<>();
    }
}
