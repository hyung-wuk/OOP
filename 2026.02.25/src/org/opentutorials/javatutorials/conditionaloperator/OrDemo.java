package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {
    public static void main(String[] args) {
        if (true || true) {
            System.out.println("1");
        } //or은 둘중 하나만 참이여도 실행됨

        if (true || false) {
            System.out.println("2");
        } //or은 둘중 하나만 참이여도 실행됨

        if (false || true) {
            System.out.println("3");
        }//or은 둘중 하나만 참이여도 실행됨

        if (false || false) {
            System.out.println("4");
        }
    }
}
