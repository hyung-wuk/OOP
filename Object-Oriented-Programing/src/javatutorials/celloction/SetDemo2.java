package javatutorials.celloction;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>(); //set은 수학에서의 집합과 같다.
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<>();
        C.add(1);
        C.add(2);

        System.out.println(A.contains(B));//false, A.containsAll(B)는 B가 A의 부분집합인지의 여부를 묻는 것과 같다.
        System.out.println(A.contains(C));//true, C는 A의 부분집합이다.

        A.addAll(B); //A와 B의 합집합
        A.retainAll(B); //A와 B의 교집합을 A에다가 담겠다는 뜻
        A.removeAll(B); //A에서 B를 뺀 차집합 A-B
    }
}//set에는 get메서드가 존재하지 않는다. 그이유는 셋 안에 있는 원소들이 순서대로 저장되어 있지 않기때문에 인덱스 값으로 원소를 받을 수 없기 때문이다.
