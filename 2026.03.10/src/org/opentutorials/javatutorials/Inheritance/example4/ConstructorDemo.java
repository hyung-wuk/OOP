package org.opentutorials.javatutorials.Inheritance.example4;

public class ConstructorDemo {
    //public ConstructorDemo(int pram1){}
    public ConstructorDemo() {} // 생성자를 명시해주면 아래잇는게 실행 가능함
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo();
        //앞에서 인자를 받는 생성자를 만들어서 기본생성자를 제외시킴 그래서 객체를 만들때 인자가 없으면 실행이 안되는거임
    }
}
