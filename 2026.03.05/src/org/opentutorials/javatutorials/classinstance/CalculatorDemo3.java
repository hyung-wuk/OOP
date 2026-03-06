package org.opentutorials.javatutorials.classinstance;

public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20); //static이 붙어있는 메소드는 클래스에 직접 접근해서 사용
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);

//        Calculator3 c1 = new Calculator3();
//        c1.sum(10,20); // 스태틱 메서드 또한 참조 할 수 있으나 지양한다
    }
}

class Calculator3{
    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }

//    static int a, b;
//    public static int setab(int a, int b){
//        this.a = a;
//        this.b = b;
//        return a+b;
//    } //스태틱 필드는 제아무리 스태틱 메서드라 해도 클래스 바깥에서 직접 참조할 수 없다. 잘 정리하자면 스태틱 메서드로 매개변수를 받아 스태틱 필드에 this로 연결하려 해도 참조가 불가능하다!!

//    static int a,b;
//    public static int setab(int A, int B){
//        a = A;
//        b = B;
//        return a+b;
//    } //아니 근데 쌰갈 이건 되네
}
