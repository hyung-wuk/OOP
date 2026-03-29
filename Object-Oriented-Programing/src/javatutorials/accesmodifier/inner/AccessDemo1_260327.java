package javatutorials.accesmodifier.inner;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()"; //앞에 접근제어자가 private이면 클래스 내부에서만 사용 가능하고, 외부에서는 접근 불가
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1_260327 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        //System.out.println(a.z()); //오류 발생
        System.out.println(a.x());
    }
}
