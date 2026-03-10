package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
    static void a (){
        int i = 0; // 지역 변수 (local variable)
    } // 메서드 안에서 변수를 선언하게되면 메서드 안에서만 유효함

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a(); //a안에 있는 변수의 값은 a밖에서는 영향을 주지 않음
            System.out.println(i);
        }
    }
}
