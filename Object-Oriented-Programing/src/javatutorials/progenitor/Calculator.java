package javatutorials.progenitor;

public class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(left+right);
    }

    public void avg(){
        System.out.println((left+right)/2);
    }

    @Override
    public String toString(){
        return super.toString() + ", " +  left + " right : " + right;
    }//Object 클래스에 있는 toString()메서드를 오버라이딩!
}

class CalculatorDemo{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        System.out.println(c1.toString());
        //toString()을 하지 않고 prinln에 인자를 전달해도 자동으로 toString을 호출함
        //그 이유는 위의 Calculator클래스가 자동으로 Object클래스를 상속 받고 있고 그안에
        //toString 메서드가 존재하며, println할때 그것이 자동으로 호출하기 때문이다.
    }
}
