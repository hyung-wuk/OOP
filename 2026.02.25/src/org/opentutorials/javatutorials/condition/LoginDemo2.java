package org.opentutorials.javatutorials.condition;

import java.util.Scanner;

public class LoginDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your id: ");
        String id = sc.nextLine();

        if(id.equals("egoing")){
            System.out.println("Please enter your password: ");
            String password = sc.nextLine();
            if(password.equals("0809")){
                System.out.println("login successful");
            }else {
                System.out.println("login unsuccessful");
            }
        }else{
            System.out.println("없는 id입니다.");
        }
    }
}
