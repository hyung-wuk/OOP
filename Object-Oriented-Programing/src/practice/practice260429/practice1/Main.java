package practice.practice260429.practice1;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Hello");

        Box<Integer> box2 = new Box<>();
        box2.setValue(10);

        System.out.println(box.getValue());
        System.out.println(box2.getValue());
    }
}
//제네릭 클래스 기본
//같은 Box클래스 이지만 타입을 다르게 사용할 수 있음