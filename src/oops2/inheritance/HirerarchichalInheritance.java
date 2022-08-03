package oops2.inheritance;

public class HirerarchichalInheritance {
    public static void main(String[] args) {
        DematAccount da1 = new DematAccount();
        da1.credit(1000);
        System.out.println(da1.balance);
        da1.addNewInvestment("abcd", 100);
        System.out.println(da1.balance);
        System.out.println(da1.invested);
        da1.addNewInvestment("mnop", 200);
        System.out.println(da1.balance);
        System.out.println(da1.invested);


    }
}
