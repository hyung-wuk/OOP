package javatutorials.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception e");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds Exception e");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } //다른 예외들보다 먼저 나오면 오류
        finally {
            System.out.println("finally");
        }//예외 여부에 관계없이 finally에 묶여있는 구문은 언제나 실행
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10,1);
        a.z(1,0);
        a.z(2,1);
    }
}
