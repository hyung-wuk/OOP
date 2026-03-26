package practice.practice260326.practice1;

public class Main {
    public static void main(String[] args) {
        String text = "Hello Java";

        System.out.println(text.length()); //길이 반환
        System.out.println(text.substring(0,5)); //문자열 일부 반환
        System.out.println(text.replace("Java","World")); //문자열 바꾸기
    }
}
