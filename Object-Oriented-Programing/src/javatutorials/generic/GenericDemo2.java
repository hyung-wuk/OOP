package javatutorials.generic;

abstract class Info{
    public abstract int getLevel();
}

class EmployeInfo2  extends Info{
    public int rank;
    public EmployeInfo2(int rank){
        this.rank=rank;
    }
    @Override
    public int getLevel() {
        return rank;
    }
}

class Person2<T extends Info, S>{ //기본 데이터 타입은 올 수 없다. 레퍼클래스(wrapper)를 사용해야한다, 레퍼 클래스는 기본 데이터 타입을 객체 처럼 사용할 수 있도록 자바에서 만든 클래스이다
    //제네릭의 제한
    //T는 info라는 클래스거나, 그것의 자식 클래스들만 들어오도록 제한 할 수 있다.
    //interface도 가능, interface 제한을 걸 떄 제네릭 옆에 implements를 사용하지 않아도 된다. 제네릭 맥락 안에서의 extends는 부모가 무엇이냐라는 뜻이 되기 때문.
    //super도 있다. 이는 extends와 반대로 부모를 제한 거는것
    public T info;
    public S id;
    Person2(T info, S id){
        this.info=info;
        this.id=id;
        info.getLevel(); // 제한 사항이 걸려 있어야만 사용 가능, extends Object 또한 사용 불가능 하다
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }//메소드에서도 제네릭 사용 가능
}

public class GenericDemo2 {
    public static void main(String[] args) {
//        Integer id = 1;
//        Person2<EmployeInfo2, Integer> p1 = new Person2<EmployeInfo2, Integer>(new EmployeInfo2(1), id);
//        System.out.println(p1.id.intValue());//Integer 클래스에 있는 intvalue()메서드는 Integer클래스 안에 있는
//                                             //데이터를 원시 데이터 타입 형태로 반환해준다.

        EmployeInfo2 e = new  EmployeInfo2(1);
        Integer id = 10;
        Person2 p1 = new Person2(e,id); //제네릭의 생략이 가능하다
        p1.<EmployeInfo2>printInfo(e.rank) ;
        p1.printInfo(id) ; //제네릭 생략

//        String s;
//        Person2 p2 = new Person2<String,Integer>(s,id); //이처럼 제한을 사용한 제네릭에 다른 클래스를 넣으면 오류 발생
    }
}
