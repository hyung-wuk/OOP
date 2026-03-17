package org.opentutorials.javatutorials.overloading.example1;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOprands(10,20);
        c.sum();
        c.avg();
        c.setoprands(10,20,30);
        c.sum();
        c.avg();
        c.setoprands(10,20,0);
        c.sum();
        c.avg();

    }
}

class Calculator {
    int left, right;
    int third = 0;
    boolean a ;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        this.a = false;
    }
    public void setoprands(int left, int right, int third) {
        this.left = left;
        this.right = right;

        //중복을 제거하려면?
        //this.setOprands(left, right);

        this.third = third;
        this.a = true;
    }

    public void sum() {
        int sum = left + right + third;
        System.out.println(sum);
    }

    public void avg() {
        if (a){
            System.out.println((this.left + this.right + this.third) / 3);
        }
        else{System.out.println((this.left + this.right) / 2);

        }
    }
}