package practice260307;

public class ScopeTest {

    void test(){
        int num = 100;
        System.out.println(num);
    }

    public static void main (String[] args){
        ScopeTest s = new ScopeTest();
        s.test();

        //System.out.println(num); // 오류, 지역변수는 메서드 밖에서 사용할 수 없음
    }
}
