package javatutorials.progenitor;

public class Student_ implements Cloneable{
    String name;
    Student_ (String name){
        this.name=name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }//clone 메서드는 반드시 예외 처리를 해야한다. 발생하는 예외는 CloneNotSupportedException이고,
    //이는 checked Exception이다. 때문에 throws하여 예외의 책임을 api사용자에게 넘긴다
    //clone메서드의 원래 시그니처의 접근제어자는 protected이나, 범용성을 높이기 위해 public으로 변경하여
    //오버라이딩 했다. 접근제어자는 더 넓은 폭으로만 변경하여 오버라이딩이 가능하다.
    //private < default < protected < public
}

class ObjectDemo_{
    public static void main(String[] args) {
        Student_ obj = new Student_("egoing");

        try {
            Student_ sw = (Student_) obj.clone(); //clone의 return 값이 Object이기 때문에 형변환 해주어야함
            System.out.println(obj.name);
            System.out.println(sw.name);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        //그냥 하는것은 안됨, Cloneable이라는 인터페이스를 임플리먼츠 해야함
        //Cloneable 인터페이스를 살펴보면 비어있음, 이것은 단순히 클론이 가능한 클래스라는것을
        //구분해주는 구분자의 역할만 하기 때문에 내용이 비어잇는것
    }

}
