package org.opentutorials.javatutorials.typeconversion;

public class ExplicitConversionDemo {
    public static void main(String[] args) {
        float a = (float)100.0; //자동 형 변환이 적용되지 않는 경우에는 수동으로 형 변환을 해야한다. 이를 명시적 형변환이라고 한다
        int b = (int)100.0F;
    }
}
