package practice.practice260429.practice4;

public class Main {
    static <T> void printValue(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        printValue(15);
        printValue("hello");
        printValue(3.14);
    }
}
//메서드에서도 제네릭 사용 가능
//입력 타입에 따라 T가 결정됨
