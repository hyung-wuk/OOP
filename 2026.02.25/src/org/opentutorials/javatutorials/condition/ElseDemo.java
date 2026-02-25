package org.opentutorials.javatutorials.condition;

public class ElseDemo {
    public static void main(String[] args) {
        if(false){
            System.out.println(1);
        }else if (true){
            System.out.println(2); //ture가 처음으로 발견된 구간에서 실행되고 그뒤에건 실행안됨
        }else if (true){
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
