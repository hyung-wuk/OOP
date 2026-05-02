package practice.practice260502.practice1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");

        System.out.print("HashSet 실행 : ");
        for(String s: set){
            System.out.print(s + " ");
        }

        System.out.print("\nArrayList 실행 : ");
        for(String s: list){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println(set.contains("A"));//false
        System.out.println(set.contains("a"));//True

        System.out.println(list.containsAll(set));//true
        System.out.println(set.containsAll(list));//true
    }
}
