package org.opentutorials.javatutorials.Inheritance.example1;

public class CalculatorDemo2 {
    public static void main(String[] args) {
        MultiplacaionableCalculator c1 = new MultiplacaionableCalculator();
        c1.setOprands(10,20);
        c1.multiplication();
    }
}

class MultiplacaionableCalculator extends Calculator {
    public void multiplication(){
        System.out.println(this.left * this.right);
    }
}