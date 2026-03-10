package org.opentutorials.javatutorials.scope;

public class ScopeDemo7 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}

class C {
    int v = 10; // 전역변수

    void m(){
        int v = 20; //지역변수 우선순위가 높아서 주석을 풀면 20이 출력
        System.out.println(v);
        System.out.println(this.v); //인스턴스 자체를 의미하는 값이 this, this가 붙게되면 전역의 값을 갖게됨
    }
}