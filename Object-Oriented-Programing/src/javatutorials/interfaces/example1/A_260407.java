package javatutorials.interfaces.example1;

//어떠한 클래스가 있고 그 클래스가 특정한 인터페이스를 사용한다면, 그 클래스는 반드시 인터페이스의
//메소드를 구현해야한다. 만약 인터페이스에서 강제하고 있는 메소드를 구현 하지 않으면
//그 애플리케이션은 컴파일조차 되지 않는다.

interface I{
    public void z(); //마치 abstract class에 있는 abstract method와 같다.
}

public class A_260407 {
    public void z(){};
}
