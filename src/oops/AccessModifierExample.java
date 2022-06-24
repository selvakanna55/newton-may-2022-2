package oops;


class Mobile{
    void calculator(){ // default
        System.out.println("im calculating some numbers");
    }
    public void torch(){
        System.out.println("torch is ON");
    }

    private void camera(){
        System.out.println("taking photos");
    }
    protected void music(){
        System.out.println("playing ganna");
    }
}
public class AccessModifierExample {
    public static void main(String[] args) {
        Mobile redmi = new Mobile();
        redmi.calculator();
        redmi.torch();
        redmi.music();
//        redmi.camera();
    }
}
