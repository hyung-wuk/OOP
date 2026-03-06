package org.opentutorials.javatutorials.classinstance;

public class CalculatorDemo2 {
    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2();
        c1.setoprands(10,20);
        c1.sum(); //30 출력

        Calculator2 c2 = new Calculator2();
        c2.setoprands(20,40);
        c2.sum();

        Calculator2.base = 10; //클래스의 필드 base를 10으로 지정
        c1.sum();
        c2.sum();

//        c1.base = 20; // 클래스의 static 필드는 객체로도 접근이 가능하지만 이는 같은 클래스를 기반으로 하는 다른 객체에도 영향이 가는 헷갈리는 방식이기 때문에 지양함.
//        c1.sum();
//        c2.sum();

    }
}

class Calculator2 {
    static double PI = 3.14; //앞에 스태틱 붙이면 클래스 안에서만 작동

    static int base = 0; //클래스 변수인 base가 추가되었다
    int left, right;

    public void setoprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public  void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}