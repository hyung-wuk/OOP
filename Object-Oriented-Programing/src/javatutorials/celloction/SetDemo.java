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
        }

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
