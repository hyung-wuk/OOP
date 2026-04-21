package practice.practice260421.practice1;

public class Main {
    static void test() throws Exception{ //throws로 던져줘야함
        throw new Exception("예외 발생");
    }//exception은 checked exception이기 때문에 그냥 throw 못함
    public static void main(String[] args) {
        try {
            test();
        }catch (Exception e){
            System.out.println("예외 처리 : " +e.getMessage());
        } //예외의 책임이 api 사용자에게로 넘어감
    }
}
