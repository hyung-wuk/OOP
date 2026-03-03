package org.opentutorials.javatutorials.consol;

import java.util.Scanner;

public class GeneralMenuConsol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        while(true) {

            System.out.println("====MENU====");
            System.out.println("1. 사칙연산");
            System.out.println("2. 등급 계산");
            System.out.println("3. 배열 평균, 최댓값, 최솟값");
            System.out.println("0. 종료");
            System.out.println("번호 선택 : ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("사칙연산 실행");
                    FourOperation(sc);
                    break;
                case 2:
                    System.out.println("등급 계산 실행");
                    Raiting(sc);
                    break;
                case 3:
                    System.out.println("배열 평균, 최댓값, 최솟값 구하기 실행");
                    ArraySystem(sc);
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                default:
                    System.out.println("wrong choice");
            }
            System.out.println(); //줄바꿈
        }

    }

    public static void FourOperation(Scanner sc) {
        double num1, num2;

        System.out.println("첫번째 수 입력 : ");
        num1 = sc.nextDouble();
        sc.nextLine(); //남은 엔터 제거

        String operator;
        System.out.println("연산 종류 입력 : ");
        operator = sc.nextLine();

        System.out.println("두번째 수 입력 : ");
        num2 = sc.nextDouble();

        Double result = 0.0;
        if (operator.equals("+")){
            result = num1 + num2;
        }
        else if (operator.equals("-")){
            result = num1 - num2;
        }
        else if (operator.equals("*")){
            result = num1 * num2;
        }
        else if (operator.equals("/")){
            result = num1 / num2;
        }

        System.out.println(result);

    }

    public static void Raiting(Scanner sc){


        System.out.println("점수 입력 : ");
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("A");
        }
        else if(score >= 80){
            System.out.println("B");
        }
        else if(score >= 70){
            System.out.println("C");
        }
        else if(score >= 60){
            System.out.println("D");
        }
        else if (score < 60){
            System.out.println("F");
        }

    }

    public static void ArraySystem(Scanner sc) {

        System.out.println("배열의 길이 입렵");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("배열의 " + i + "번째 인덱스 값 입력 : ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        double sum = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] < min) { //최솟값 찾기
                min = arr[i];
            }
            if (arr[i] > max) { //최댓값 찾기
                max = arr[i];
            }
            sum += arr[i];
        }
        double average = sum / arr.length;

        System.out.println("Minimum is : " + min);
        System.out.println("Maximum is : " + max);
        System.out.println("Average is : " + average);
    }
}
