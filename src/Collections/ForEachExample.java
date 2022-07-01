package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        System.out.println(list);

        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(String num:list){
            System.out.print(num+" ");
        }
        System.out.println();

        String arr2[] = {"Newton", "ANC", "dkfj", "fkj"};
        for(String fr:arr2){
            System.out.print(fr+" ");
        }



    }
}
