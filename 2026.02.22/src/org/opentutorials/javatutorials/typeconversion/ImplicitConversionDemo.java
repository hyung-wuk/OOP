package org.opentutorials.javatutorials.typeconversion;

public class ImplicitConversionDemo {
    public static void main(String[] args) {
        //double a = 3.0F; //에러가 나지 않음 double(8byte)이 float(4byte)보다 더 많은 수를 포함 할 수 있기 때문에 암시적 형변환(자동 형변환이 일어남)
        //float a = 3.0; //float변수에 double형 상수가 할당될 때에는 정보의 손실이 발생하기떄문에 에러 발생

        // byte -> short -> int -> long -> float -> double //char는 int로 형변환 할수 있음 (문자의 유니코드 값으로 변환이 됨) int가 char는 안됨

        int a = 3;
        float b = 1.0F;
        double c = a+b; //int와 float을 공통적으로 형변환 받을수(?)있는것은 double이기때문에 double로 받아야함
        System.out.println(c);
    }
}
