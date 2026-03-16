package org.opentutorials.javatutorials.Inheritance.example3;

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {

    }
}

class Calculator {

    int left, right;

//    public Calculator() {} //없으면 오류남

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }// 생성자를 만들면 기본 생성자는 없어짐(?) 따라서 자식 생성자가 상속 하려면 기본생성자를 명시해줘야함
     // 자식 클래스가 인스턴스화 될 때 자동으로 그 부모 생성자의 기본생성자가 호출되게 되어있는데 기본 생성자가 없으면 그게 안돼서 오류남
    public void setOrprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left/this.right)/2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
//        this.left = left;
//        this.right = right;
        super(left, right); //근데 수퍼를 쓰면 부모 클래스에 기본 생성자가 없어도 부모 클래스의 필드에 인자를 직접 전달 할 수 있게 돼서 오류가 안생김!
    } //부모클래스에 기본 생성자가 없으므로 오류 발생

    public void substract(){
        System.out.println(this.left-this.right);
    }
}