package oops2;

class Phone { // parent
    void call() {
        System.out.println("calling to abcd");
    }

    void message() {
        System.out.println("sms sent");
    }
}

class AndroidPhone extends Phone { //child

    void browseSomePage() {
        System.out.println("browser is phone");
    }

    void call() {
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


////overloading vs overrding
//overloading -> same function name, with different parameters
//overriding -> same function, same name, same parameters in the any of the child class (only when inheritance)
