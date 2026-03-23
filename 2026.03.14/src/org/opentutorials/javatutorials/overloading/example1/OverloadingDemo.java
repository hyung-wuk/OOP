package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
    void A () {System.out.println("void A()");}
    void A (int arg1){System.out.println("void A(int arg1)");}
    void A (String arg1){System.out.println("void A(String arg1)");}
    //int A () {System.out.println("void A (String arg1)")}
    //오버로딩 할 때, 반환값이 다르면 실행되지 않음.

    public static void main(String[] args){
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(10);
        od.A("Hello");
    }
}
