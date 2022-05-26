import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }

        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        System.out.println("------------");
         i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);







    }
}
