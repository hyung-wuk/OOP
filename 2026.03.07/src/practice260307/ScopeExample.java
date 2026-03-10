package practice260307;

public class ScopeExample {
    int global = 10; //전역변수 (인스턴스 변수)

    void printValues(){
        int local = 20; // 지역변수

        System.out.println("global = " + global);
        System.out.println("local = " + local);
    }

    public static void main (String[] args){
        ScopeExample s = new ScopeExample();
        s.printValues();
    }
}
