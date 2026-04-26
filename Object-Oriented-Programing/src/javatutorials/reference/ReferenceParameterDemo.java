package javatutorials.reference;

public class ReferenceParameterDemo {

    static void _value(int b){
        b=2;
    }
    static void runValue(){
        int a =1;
        _value(a);
        System.out.println("runValue, " + a);
    }


    static void _reference1(A b){
        b = new A(2);
    }
    static void runReference1(){
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, " + a.id);
    }//b = new A(2)를 함으로써 b와 a는 서로다른 인스턴스를 참조한다 따라서
     //a의 값은 바뀌지 않음


    static void _reference2(A b){
        b.id = 2;
    }
    static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, " + a.id);
    }//b와 a는 참조하는 인스턴스가 같음, 따라서 a의 값도 바뀜


    public static void main(String[] args) {
        runValue();
        runReference1();
        runReference2();
    }
}
