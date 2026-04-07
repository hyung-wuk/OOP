package javatutorials.finals;

class Calculator{
    static final double PI = 3.14; //필드를 final로 생성, 제일 빈도수가 많음
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}

public class CalculatorDemo1_260407 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOprands(10,20);
    }
}
