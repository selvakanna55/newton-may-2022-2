package Recall;


import Hashing.LinearSearch;
import javafx.util.Pair;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class CollectionsRecall {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 3};
        int n = arr.length;
        // ans:3
        // find the element with maximum freq;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])==true){
                int freq = hm.get(arr[i]);
                hm.put(arr[i], freq+1);
            }else{
                hm.put(arr[i], 1);
            }
        }
        //{1=2, 2=2, 3=4}
        int freq = -1, num = -1;
        for(int val:hm.keySet()){ //
            if(freq<hm.get(val)){
                num = val;
                freq = hm.get(val);
            }
        }
        System.out.println(num+" "+freq);


    }
    public static void arraylist(){
        //wrapper class, int -> Integer
        // double -> Double
        ArrayList<Integer> li = new ArrayList<>();
        li.add(10); //at at the end
        li.add(20);
        li.add(1, 99);
        System.out.println(li);
        System.out.println(li.size());
        Integer num = 20;
        System.out.println(li.get(1));
        li.remove(num);
        System.out.println(li);
        li.indexOf(10); //linear search
    }
    void pair(){
        //        Pair<Integer, Integer> p = new Pair<>(10, 20);
//        System.out.println(p.getKey());
//        System.out.println(p.getValue());
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('a');
        ts.add('b');

        for(Character ch:ts){
            System.out.println(ch);
        }
    }
}
