package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //System.out.println(i); //포문 안에서만 유효한 지역변수 i는 그 밖에서는 접근 ㄴㄴ
    }
}
