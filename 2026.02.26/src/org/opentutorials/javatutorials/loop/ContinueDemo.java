package org.opentutorials.javatutorials.loop;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++){
            if (i==5) {
                continue; //5가 됐을때 반복문이 일단 정지가 되지만 바로 다음부터 다시 실행됨
                          //그래서 출력 값에 5가 빠져있음
            }
            System.out.println("Coding everybody" + i );
        }
    }
}
