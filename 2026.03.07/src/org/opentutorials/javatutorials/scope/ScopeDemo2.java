package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {

    static int i; // 클래스에 속해있어 클래스 전역에 영향을 미치는 전역 변수(global variable)

    static void a(){
        i=0;
    }

    public static void main(String[] args) {
        for(i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }
    } // 무한루프 일어남
}
