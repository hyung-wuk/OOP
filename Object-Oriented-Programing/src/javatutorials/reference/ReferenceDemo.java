package javatutorials.reference;

public class ReferenceDemo {
    public static void runValue(){
        int a =1;
        int b = a;
        b = 2;
        //이렇게 하면 a의 값이 2가 될까? 겟노 ㅋㅋ
        //b의 값에는 a안의 값을 복제해서 담은것, b는 a 그자체가 아니기에
        //b의 값을 바꾼다해서 a안의 값이 똑같이 바뀌지 않는다는것은 당연지사 인지상정
        System.out.println("runValue, " + a);
    }

    public static void main(String[] args) {
        runValue();
    }
}
//new 로 생성하는 데이터타입은 참조 데이터타입형이다, 이외에 원래 잇는것들은 원시(기본) 데이터형