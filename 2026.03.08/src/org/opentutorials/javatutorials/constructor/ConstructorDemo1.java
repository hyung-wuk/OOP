package org.opentutorials.javatutorials.constructor;

public class ConstructorDemo1 {
    public static void main(String[] args) {

        Calculator c = new Calculator(10,20); //뒤에잇는게 생성자 엿던것, 클래스에서 생성자를 안만들면 자동으로 생성됨
        c.sum();
        c.avg();

        Calculator c2 = new Calculator(20,40);
        c2.sum();
        c2.avg();
    }
}

class Calculator{
    int left, right;

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }// 생성자(constructor) 가장 먼저 실행됨

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}