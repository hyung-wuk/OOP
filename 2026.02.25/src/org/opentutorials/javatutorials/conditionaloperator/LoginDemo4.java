package org.opentutorials.javatutorials.conditionaloperator;

import java.util.Scanner;

public class LoginDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id : ");
        String id = sc.nextLine();
        System.out.println("password : ");
        String password = sc.nextLine();

        if ((id.equals("egoing") || id.equals("admin") || id.equals("tvpandapam"))
                && password.equals("0809")) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Failed");
        }
    }
}
