package javatutorials.reference;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}

public class ReferenceDemo1 {
    public static void runValue(){
        int a =1;
        int b = a;
        System.out.println("runValue, " + a);
    }

    public static void runReference(){
        A a = new A(1);
        A b = a; //a와 b가 같은 인스턴스를 가르킴
        b = new A(2);//이제 a와 b가 서로 다른 인스턴스를 가르킴
        b.id = 2;
        System.out.println("runReference, " + a.id);
    }

    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
