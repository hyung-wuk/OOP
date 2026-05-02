package practice.practice260502.practice2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        Collection<String> set = new HashSet();
        //ArrayList, HashSet 모두 Collection으로 다룰 수 있다.
        //공통기능은 Collection 타입으로도 사용 가능하다.

        list.add("a");
        list.add("a");
        list.add("b");

        set.add("a");
        set.add("a");
        set.add("b");

        System.out.println("list size = " +  list.size());
        System.out.println("set size = " +  set.size());

        Iterator <String> it = list.iterator(); //제네릭 사용가능
        Iterator it2 = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            System.out.println(it2.next());
//        }
        //오류 발생
//        Exception in thread "main" java.util.NoSuchElementException
//        at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1607)
//        at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1628)
//        at practice.practice260502.practice2.Main.main(Main.java:28)
        //NoSuchElementException은 컬렉션에서 요소를 가져오려고 할 때 해당 요소가 없는 경우에 발생하는 예외,
        //주로 Iterator나 Enumeration과 같은 컬렉션 요소 반복자를 사용 할때 발생
        //두 컬렉션의 size가 다른데 하나의 while문안에서 두개의 컬렉션의 요소를 모두 가져오려해서 오류 발생
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");

        while (it2.hasNext()) {
            System.out.print(it2.next()+ " ");
        }
        System.out.println("\n");

        it = list.iterator();
        // Iterator는 한 번 순회하면 내부 커서가 끝까지 이동함
        // 따라서 재사용 시에는 반드시 iterator()를 다시 호출해서 새로 생성해야 한다
        // 그렇지 않으면 hasNext()가 false가 되어 반복문이 실행되지 않는다
        while(it.hasNext()) {
            String value = it.next(); //위에서 변수 선언시에 제네릭으로 제한을 걸어 형변환 필요X

            if(value.equals("b")){
                it.remove();
            }
        }
        for(String s: list){
            System.out.println(s);
        }
        //반복중 삭제할 때는 Iterator의 remove()를 쓰는 방식이 안전
    }
}

