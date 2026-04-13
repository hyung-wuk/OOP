package javatutorials.polymorphism;

class A_{
    public String x(){ return "A.x";}
}

class B_ extends A_{
    @Override
    public String x(){ return "B.x";}
    public String y(){ return "y";}
}

class B2 extends A_{
    @Override
    public String x(){ return "B2.x";}
}

public class PpolymorphismDemo1_1_260409 {
    public static void main(String[] args) {
        A_ obj = new B_();
        A_ obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
        //System.out.println(obj.y()); //obj의 타입이 A_라 B_안에 있는
        //y메서드는 부모한테서 상속 받지 않은 메서드라 실행이 안됨
    }
}
