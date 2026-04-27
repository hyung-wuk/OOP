package practice.practice260428.practice4;

class Box<T>{
    T data;

    void setValue(T data){
        this.data = data;
    }

    T getValue(){
        return this.data;
    }


}

public class Main {
    public static void main(String[] args) {
        Box<String> s = new Box<String>();
        Box<Integer> i = new Box<Integer>();

        s.setValue("Hello");
        i.setValue(10);

        System.out.println(s.getValue());
        System.out.println(i.getValue());
    }
}
//직접 제네릭 클래스 만들어보기
//T는 임시타입 이름, 사용할 때 String, Integer등으로 결정됨
