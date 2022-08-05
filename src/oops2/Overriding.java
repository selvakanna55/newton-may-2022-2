package oops2;

class Phone {
    void call() {
        System.out.println("calling to abcd");
    }

    void message() {
        System.out.println("sms sent");
    }
}

class AndroidPhone extends Phone {

    void browseSomePage() {
        System.out.println("browser is phone");
    }

    void call() {
        super.call(); //call parent
        System.out.println("call is disconnected in android phone");
    }


}

public class Overriding {
    public static void main(String[] args) {
        AndroidPhone ap = new AndroidPhone();
        ap.call();
        ap.message();
    }
}
