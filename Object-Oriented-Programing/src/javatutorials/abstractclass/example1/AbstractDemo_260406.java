package javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b();
    //추상 메서드는 실질적인 본체는 없고, 시그니처만 가지고 있는 형태 따라서 추상 클래스를 상속 받는
    // 자식 클래스는 추상 클래스 안에 잇는 추상 메서드를 반드시 오버라이드 해야함

//    public abstract int c(){
//        System.out.println("Hello");
//    } //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.

    public void d(){
        System.out.println("world");
    } // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
} // 멤버중에 하나가 추상이라면 그 멤버를 가지고 잇는 클래스는 추상 클래스가 된다

class B extends A{
    @Override
    public int b() {
        return 1;
    }
}

public class AbstractDemo_260406 {
    public static void main(String[] args) {
//        A obj = new A();
        //추상 클래스는 반드시 그것을 상속해서 사용해야함

        B obj = new B();
    }
}
