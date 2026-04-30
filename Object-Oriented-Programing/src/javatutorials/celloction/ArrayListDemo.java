package javatutorials.celloction;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObj =  new String[2];
        arrayObj[0] = "One";
        arrayObj[1] = "Two";
        //arrayObj[2] = "Three"; //기존에 만든 배열의 길이를 넘어서서 오류가 발생

        for (int i = 0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

//        ArrayList al = new ArrayList();
//        al.add("One");
//        al.add("Two");
//        al.add("Three");
//        for (int i = 0; i < al.size(); i++) {//ArrayList는 size
//            String value = (String) al.get(i); //ArrayList는 get, ArrayList 안의 인자값은 Object 타입이라
//                                               //어떤 데이터 타입이든지 받을 수 있다. 그러나 그 값은 반환 받으려면 변수의
//                                               //데이터 타입에 맞추어 형변환이 필요하다.
//            System.out.println(value);
//        }

        ArrayList <String> al = new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three"); //제네릭으로 제한을 걸어 String만 입력 받게 할 수 있음
        for (int i = 0; i < al.size(); i++) {
            String value = al.get(i);
            System.out.println(value);
        }

    }
}
