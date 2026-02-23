package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a / b); //int타입이라 정보의 손실 발생
        System.out.println(c / d); //float타입이라 들 발생
        System.out.println(a/d); //int가 float으로 자동형변환
    }
}
