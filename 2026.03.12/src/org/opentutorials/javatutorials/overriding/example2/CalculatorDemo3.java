package org.opentutorials.javatutorials.overriding.example2;

public class CalculatorDemo3 {
    public static void main (String[] args) {

    }
}

class Calculator1 {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public int avg(){
        return (this.left + this.right)/2;
    }
}

class SubstractableCalculator1 extends Calculator1 {

    public void sum(){
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    } //부모 클래스에 있는 메서드를 재정의 (오버라이딩), 부모 클래스에 있는 같은 이름의 메서드 보다 우선순위가 높다

    public int avg(){
        return super.avg();
    }
    // overriding을 하기 위해서는 메소드의 리턴 형식이 같아야한다. 그밖에도 오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
    // 메소드의 이름,
    // 메소드 매개변수의 숫자와 데이터 타입, 그리고 순서
    //메소드의 리턴 타입
    //위와 같이 메소드의 형태를 정의하는 사항들을 통틀어, 메소드의 서명(signature)라고 한다.

    public void substract(){
        System.out.println(this.left - this.right);
    }

}