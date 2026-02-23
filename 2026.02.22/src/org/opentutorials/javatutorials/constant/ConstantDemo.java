package org.opentutorials.javatutorials.constant;

public class ConstantDemo {
    public static void main(String[] args) {
        //int a = 2.2; //데이터타입이 안맞음
        //float a = 2.2; //둘다 실수를 뜻하는 데이터타입인데 미스매치가 뜸
        //double a = 2.2; //2.2의 데이터 타입은 double
        //float a = 2.2F; //상수 뒤에 F붙여주면 float형됨

        //int a = 2147483648; //integer의 범위를 벗어남
        //long a = 2147483648; //long의 범위인데도 에러 발생 이유는 뒤의 상수가 integer 데이터 타입으로 기본 지정 돼있어서
        long a = 2147483648L; //상수뒤에 L붙여주면 long타입으로 형변환
        byte b = 100; // 뒤의 상수의 데이터타입이 int임에도 불구 에러가 일어나지 않음 그이유는 자바에서 편의상 byte와 short같은 경우에 뒤의 상수의 데이터타입이 int여도 허용을 해주기 때문
        short c = 200;
    }
}
