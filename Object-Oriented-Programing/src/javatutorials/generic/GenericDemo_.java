package javatutorials.generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){this.grade=grade;}
}
class StudentPerson{
    public StudentInfo info;
    public StudentPerson(StudentInfo info){this.info=info;}
}//중복 발생
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank=rank;}
}
class EmployeePerson{
    public EmployeeInfo info;
    public EmployeePerson(EmployeeInfo info){this.info=info;}
}//얘랑 쟤랑 같음

public class GenericDemo_ {
    public static void main(String[] args) {
        StudentInfo si =new StudentInfo(2);
        StudentPerson sp=new StudentPerson(si);
        System.out.println(sp.info.grade);//2

        EmployeeInfo ei =new EmployeeInfo(1);
        EmployeePerson ep=new EmployeePerson(ei);
        System.out.println(ep.info.rank);//1
    }
}
//제네릭이 없을 때 만든 코드
