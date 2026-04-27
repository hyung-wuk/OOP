package practice.practice260428.practice3;

import java.util.ArrayList;

public class Main {
        public  static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            for(int num : list){
                System.out.println(num);
            }
        }
}
//Integer제네릭
//기본형 int대신 Integer사용, 컬렉션에는 객체 타입을 넣는다.
