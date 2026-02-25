package org.opentutorials.javatutorials.io;

import  java.util.Scanner;

public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt()*1000);
        }// .hasnextint <-사용자가 입력한 값이 숫자라면 true반환 반복문 실행, 숫자가 아니라면 false 반환 반복문 중지
        sc.close();
    }
}
