package practice260305;

public class practice4 {
    public static void main(String[] args) {
        Test.method1();

        Test t = new Test();
        t.method2();

        //Test.method2(); //메소드2는 인스턴스 메소드라 객체 없이 클래스 이름으로 참조 불가.

    }
}

class Test{
    static void method1(){
        System.out.println("클래스 메소드");
    }

    void method2(){
        System.out.println("인스턴스 메소드");
    }
}
