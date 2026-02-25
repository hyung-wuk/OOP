package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {
    public static void main(String[] args) {
        if (true && true) {
            System.out.println("1");
        } //and는 둘다 true여야 실행됨

        if (true && false) {
            System.out.println("2");
        }

        if (false && true) {
            System.out.println("3");
        }

        if (false && false) {
            System.out.println("4");
        }
    }
}
