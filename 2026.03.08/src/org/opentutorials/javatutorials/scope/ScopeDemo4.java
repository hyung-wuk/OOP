package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title); //지역변수는 메소드 밖에서 접근 ㄴㄴ
    }
}
