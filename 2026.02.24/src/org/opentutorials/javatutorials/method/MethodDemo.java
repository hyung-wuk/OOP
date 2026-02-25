package org.opentutorials.javatutorials.method;

public class MethodDemo {
    public static void main(String[] args) {
        numbering(); //메서드의 호출

    }

    public static void numbering() {
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    } //메서드의 정의
}
