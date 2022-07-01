package Collections;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentWithMaxMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4
        ArrayList<Pair<String, Integer>> list = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        li.add(new Integer(10));
        for (int i = 0; i < n; i++) { //3 3<4
            String name = sc.next();
            int mark = sc.nextInt();
//            Pair<String, Integer> studentInfo = ;
            list.add(new Pair<>(name, mark));
        }
        //[<Newton, 91>, <ABC, 95>, <DEF, 77>, <qwer, 55>]
        //[<Key, value>]
        String studentName = list.get(0).getKey(); // name //ABC
        int maximumMark = list.get(0).getValue(); // mark 95

        for (Pair<String, Integer> studentInfo : list) {
            if (maximumMark < studentInfo.getValue()) { //95<55 false
                maximumMark = studentInfo.getValue();
                studentName = studentInfo.getKey();
            }
        }
        System.out.println(studentName);

    }


}
