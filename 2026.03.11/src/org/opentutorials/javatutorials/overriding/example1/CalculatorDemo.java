package org.opentutorials.javatutorials.overriding.example1;

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractableCalculator c1 = new SubstractableCalculator();
        c1.setOprands(10,20);
        c1.sum();

    }
}

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}

class SubstractableCalculator extends Calculator {

    public void sum(){
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    } //부모 클래스에 있는 메서드를 재정의 (오버라이딩), 부모 클래스에 있는 같은 이름의 메서드 보다 우선순위가 높다
    public void substract(){
        System.out.println(this.left - this.right);
    }

}