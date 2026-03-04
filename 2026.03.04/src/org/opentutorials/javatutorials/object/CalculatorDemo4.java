package org.opentutorials.javatutorials.object;

public class CalculatorDemo4 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(); // 인스턴스 생성, 데이터 타입을 직접 만든다라고 생각하면 좋음
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();
    }
}

class Calculator{
    int left, right; //필드

    public void setOprands(int left, int right){
        this.left = left; //this.은 필드를 가리킴, 아무것도 없는건 매개변수를 가리킴
        this.right = right;
    } //메서드

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}