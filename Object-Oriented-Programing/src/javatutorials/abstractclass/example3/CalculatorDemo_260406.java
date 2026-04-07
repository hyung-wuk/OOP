package javatutorials.abstractclass.example3;

abstract class Calculator{
    int left, right;

    public void setOprands(int left,int right){
        this.left=left;
        this.right=right;
    }

    public abstract void add();
    public abstract void avg();
    public abstract void sub();

    public void run(){
        add();
        avg();
        sub();
    }
}

class CaculatorDecoPlus extends Calculator{
    @Override
    public void add(){
        System.out.println("+++" + (left + right) + "+++");
    }
    public void avg(){
        System.out.println("+++" + ((left + right)/2) + "+++");
    }
    public void sub(){
        System.out.println("+++" + (left - right) + "+++");
    }
}

class CaculatorDecoMinus extends Calculator{
    @Override
    public void add(){
        System.out.println("---" + (left + right) + "---");
    }
    public void avg(){
        System.out.println("---" + (left + right)/2 + "---");
    }
    public void sub(){
        System.out.println("---" + (left - right) + "---");
    }
}

public class CalculatorDemo_260406 {
    public static void main(String[] args) {
        CaculatorDecoPlus c = new CaculatorDecoPlus();
        CaculatorDecoMinus c1 = new CaculatorDecoMinus();

        c.setOprands(10,2);
        c1.setOprands(10,2);

        c.run();
        c1.run();

    }
}
