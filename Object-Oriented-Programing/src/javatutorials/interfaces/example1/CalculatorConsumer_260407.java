package javatutorials.interfaces.example1;

class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
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
//계산기 클래스를 1발자가 만들고, 그 클래스를 사용하는 로직을 2발자가 만든다고 할때,
//1발자가 계산기 클래스를 다 만들고 나서 2발자가 사용 로직을 만들면 개발 시간이 너무 늘어남
//1발자랑 2발자가 동시에 개발을 하는것이 효율적, 2발자는 1발자가 계산기 클래스 잘만들어서
//나중에 제출할 것이라고 기대하고 개발을 진행!
//그래서 위와 같이 더미 클래스를 기반으로 가짜 로직을 만들어서 코드를 작성!