package javatutorials.celloction;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet <Integer> ();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3); //set은 중복을 저장하지 않음

        Iterator hi = (Iterator) hs.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        } //iterator는 반복자라는 뜻으로 모든 콜렉션 프레임 워크에 메서드로 존재하며 불러 올 수 있다.
        //iterator는 인터페이스이다. 프레임워크 안에있는 이터레이터 메서드로 객체를 만들 수 있으며 그 객체의 데이터 타입은 이터레이터 이다.
        //각각의 콜렉션들 안에 있는 원소들의 값들을 하나하나 꺼내어 올 수 있다.
        //iterator 안의 메서드
        //1.hasNext()
        //위의 예시처럼 iterator를 만들게되면 hs와 원소값이 똑같은 가상의 컨테이너를 만들게 된다. 그것이 iterator hi 이다.
        //hasNext는 hi안에 원소가 있는지 여부를 판별한다.
        //2.next()
        //next는 hi안의 원소중 하나를 return한다. 그리고 이터레이터 가상 컨테이너 안의 그 원소를 삭제한다.

        HashSet <Integer> hs2 = new HashSet <Integer> ();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        HashSet <Integer> hs3 = new HashSet <Integer> ();
        hs3.add(1);
        hs3.add(2);

        System.out.println(hs.containsAll(hs2)); //false
        System.out.println(hs.containsAll(hs3)); //True
    }
}
