package practice.practice260430.practice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

        for (int i : list){
            System.out.println(i);
        }

        list.remove(0); //removoe(index)는 해당 인덱스 삭제, 삭제 후 뒤 요소들이 앞으로 당겨짐
        for (int i : list){
            System.out.println(i);
        }
    }
}
