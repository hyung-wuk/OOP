package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); //4출력
        ++i;
        System.out.println(i); //5출력
        System.out.println(++i); //6출력
        System.out.println(i++); //6출력 //이 맥락이 끝나면 1증가 당장 반영은 안됨
        System.out.println(i); //7출력
    }
}
