package javatutorials.progenitor;

public class Student {
    String name;
    Student(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){ //6. 어떠한 매개변수를 받을 때 어떠한 데이터 타입으로 받을지
                                        // 모를때에 Object 데이터 타입으로 받는다.
        //2.그러나 Object 데이터 타입으로 객체를 매개변수로 받게 되면 Student 클래스의 변수인
        //name이라는 인자에 접근 할 수가 없다. 그이유는 당연하게도 Object클래스엔 name이라는 변수가 없기 때문!

        Student _obj = (Student)obj; //4.따라서 매개변수 obj의 데이터타입을 Student로 "형변환"시켜야 한다.
        //Student s = obj; //3.옆의 예시는 불가능 하다 자식의 클래스에 부모 클래스 데이터 타입은 담을 수 없다
        return name ==_obj.name;

        //5.귀찮게 이거저거 하지 말고 매개변수를 Student로 받으면 되지 않을까? 이지랄 마라
        //오버라이드 시 원래 메서드의 시그니처를 고대로 해야한단 것을 잊지마라
    }
}

class ObjectDemo{
    public static void main(String[] args){
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        //1.위의 오버라이드된 equals메서드를 보라. 메서드의 매개변수의 데이터 타입은 Object인데
        //메인 에서 equals를 호출할때 대입한 객체의 데이터 타입은 Student이다.
        //이것이 가능한 이유는 Student는 Object의 자식 클래스이고, 이전 다형성 에서 배웠다 싶이
        //부모 클래스의 데이터 타입의 객체로 자식클래스 데이터타입으로 들어 갈 수 있다.
        //위 의 예제의 모습은 이것을 매개변수 관점에서 보여진것이다.

        //7.equals를 제대로 구현하려면 hasgCode()와 같이 구현해야 한다. 이에 대한 내용은 알아서 공부해라
        //8. String, int char ...과 같은 원시데이터 형을 비교할 때에는 == 비교 연산자를 이용하고,
        //객체를 비교할때에는 equals를 이용해라. equals는 오버라이드 하지 않는것이 권장된다
    }
}
