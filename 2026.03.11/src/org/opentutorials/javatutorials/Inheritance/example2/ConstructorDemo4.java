package org.opentutorials.javatutorials.Inheritance.example2;

public class ConstructorDemo4 {
    public static void main(String[] args) {

        SubstractionableCalculator su = new SubstractionableCalculator(10,20);
        su.sum();
        su.avg();
        su.substract();

    }
}

class Calculator {
    int left, right;

    public void setOrprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left/this.right)/2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void substract(){
        System.out.println(this.left-this.right);
    }
}