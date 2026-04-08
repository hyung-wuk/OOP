package javatutorials.polymorphism;

class A{
    public String x(){
        return "A.x";
    }
}
class B extends A{
    @Override
    public String x(){
        return "B.x";
    }

    public String y(){
        return "y";
    }
}
public class PolymorphismDemo1_260408 {
    public static void main(String[] args) {
        A obj = new B();
//        //클래스 B로 객체를 만드는데 객체의 데이터 타입이 A
//
//        obj.x(); //실행됨. B로 만들어진 객체지만 B는 A의 자식 클래스이기 때문에 데이터 타입이 A 임에도 실행됨
//        //obj.y(); //오류발생 : 객체의 데이터 타입이 A기 때문에 클래스 B로 만들어진 객체임에도
//                   // y()는 실행 불가능

        System.out.println(obj.x()); // 결과 : B.x
    }
}
//객체를 생성할때 그 객체의 데이터 타입은 만들어진 클래스와 같을 수도, 그 부모 클래스 일 수 있다.
//효과 :
