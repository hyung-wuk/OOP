package practice.practice260420.practice4;

public class Main {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            int result = 10 / 0;
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("숫자 변환 오류");
        }catch (ArithmeticException e){
            System.out.println("수학 계산 오류");
        }finally {
            System.out.println("무조건 실행되는 finally");
        }
    }
}
