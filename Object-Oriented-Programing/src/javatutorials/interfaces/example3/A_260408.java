package javatutorials.interfaces.example3;

interface I1{
    public void x();
}

interface I2{
    public void z();
}

public class A_260408 implements I1,I2{
    public void x(){}
    public void z(){}
}
//하나의 클래스는 여러개의 인터페이스를 구현 할 수 있다.