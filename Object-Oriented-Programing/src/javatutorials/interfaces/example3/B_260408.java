package javatutorials.interfaces.example3;

interface I3{
    public void x();
    //private void y(); //인터페이스의 멤버는 반드시 public 이여야 한다
}

interface I4 extends I3{
    public void z();
}

public class B_260408 implements I4{
    public void x(){}
    public void z(){}
}
//인터페이스 또한 상속이 가능하다