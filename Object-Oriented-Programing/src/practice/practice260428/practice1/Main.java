package practice.practice260428.practice1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add("hello");
        list.add(10);

        String str = (String) list.get(0);
        //String str2 = (String)list.get(1); 오류 발생
        System.out.println(str);
        //System.out.println(str2);
    }
}
//제네릭 없는 ArrayList
//여러타입이 들어갈 수 있으나, 꺼낼 떄 형변환이 필요,
//실수 가능성이 크다