package javatutorials.interfaces.example2;

class CalculatorDummy implements Calculatable_260407 {
    public void setOprands(int left, int right, int third) {}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}

public class CalculatorConsumer_260407 {
    public static void main(String[] args) {
        CalculatorDummy dummy = new CalculatorDummy();
        dummy.setOprands(10,20,30);
        System.out.println(dummy.sum()+dummy.avg());
    }
}
//인터페이스는 클래스에 어떤 멤버를 넣어야할지 정해놓은 명세서와 같다.
