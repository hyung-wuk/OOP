package practice.practice260421.practice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000);
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        try {
            a.withdraw(money);
        }catch (BalanceException e){
            System.out.println(e.getMessage());
        }
        a.showBalance();
    }
}
