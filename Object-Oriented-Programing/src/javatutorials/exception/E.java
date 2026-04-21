package javatutorials.exception;

import java.io.IOException;

class E {
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    //위의 메서드는 아래와는 다르게 따로 핸들링해주지 않아도 동작됨
    //아래의 메서드는 핸들링하지 않으면 빨간줄 그임
    //오류를 해결하는 방법은 2가지
    void throwIOException1() {
        try {
            throw new IOException();
        }catch(IOException e){
            e.printStackTrace();
        }
    }//try catch로 묶어주기
    void throwIOException2() throws IOException{
        throw new IOException();
    }//이 api를 사용하는 사용자 한테 떠넘기기
}

//위의 메서드가 핸들링 없이 throw가 가능한 이유 :
//모든 exception들은 throwable클래스를 부모로 가짐,
//IOException은 Exception의 직계 자식 클래스 (중간에 뭘 끼고 있지 않음)
//ArthmeticException은 RuctimeException의 자식 클래스, RuntimeException은 Exception의 자식 클래스이다.
//결론은 RuntimeException을 끼고 있냐, 아니냐의 유무로 인해 위와같은 결과가 나온것

//부모중에 RuntimeException을 가지고 있는 예외는 unchecked exception이라고 하고
//throw를 그냥 사용 가능함
//부모중에 RuntimeException을 가지고 있지 않은 예외를 checked exception이라고 하고
//반드시 try catch로 감싸거나 throws로 예외에 대한 책임을 떠넘겨야함
