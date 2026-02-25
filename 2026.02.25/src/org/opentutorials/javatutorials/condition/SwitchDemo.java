package org.opentutorials.javatutorials.condition;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
//        System.out.println("switch(1)");
//        switch(1){
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//        }
//
//        System.out.println("switch(2)");
//        switch(2){
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//        }
//
//        System.out.println("switch(3)");
//        switch(3){
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//        }
//
//        switch(4){
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("default");
//        } // 조건에 들어온 값이 케이스에 속하지 않으면 디폴트가 실행

        Scanner sc = new Scanner(System.in);
        System.out.println("1, 2, 3중에 선택 : ");
        int val = sc.nextInt();
        if(val==1){
            System.out.println("one");
        } else if(val==2){
            System.out.println("two");
        } else if(val==3){
            System.out.println("three");
        }

        switch(val){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        } //switch문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용 할 수 있다.
          // byte, short, char, int, enum, String, Character, Short, Integer
    }
}
