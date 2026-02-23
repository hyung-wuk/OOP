package org.opentutorials.javatutorials.datatype;

public class IntDatatypeDemo {
    public static void main(String[] args) {
        byte a ;
        a = 127 ;
        //a = 128 ; //byte(1byte)타입은 -128~127

        short b ;
        b = 128 ; // short(2byte) : -32768 ~ 32767
        // int(4byte) : -2147483648 ~ 2147483647
        // long(8byte) : 개큰수를 표현할수 있슨

        //실수는 float(4byte), double(8byte)이 있고 double이 더 긴자리를 표현 할 수 있음
        //문자는 char 2byte 사용
    }
}
