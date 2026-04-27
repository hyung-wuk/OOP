package javatutorials.generic;

class StudentInfo_{
    public int grade;
    StudentInfo_(int grade){this.grade=grade;}
}

class EmployeeInfo_{
    public int rank;
    EmployeeInfo_(int rank){this.rank=rank;}
}
class Person_{
    public Object info;
    public Person_(Object info){this.info=info;}
}

public class GenericDemo__ {
    public static void main(String[] args) {
        Person_ p1=new Person_ ("부장");
        EmployeeInfo_ ei = (EmployeeInfo_) p1.info;
        System.out.println(ei.rank);
    }
}
