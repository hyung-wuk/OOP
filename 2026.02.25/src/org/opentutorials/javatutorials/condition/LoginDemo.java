package org.opentutorials.javatutorials.condition;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your id: ");
        String id = sc.nextLine();

        if(id.equals("egoing")){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}
