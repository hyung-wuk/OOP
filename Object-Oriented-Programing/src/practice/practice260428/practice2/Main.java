package practice.practice260428.practice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");

        String str = list.get(0);
        System.out.println(str);
    }
}
//제네릭을 사용한 ArrayList
//String만 저장 가능하게 강제 할 수 있음, 또 꺼낼 때 형변환이 필요없음
//코드가 안전해진다
