package practice.practice260428.practice5;

class Box{
    Object data;

    void setValue(Object data){
        this.data = data;
    }
    Object getValue(){
        return this.data;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(10);

        int value = (int)box.getValue();
        System.out.println(value);
    }
}
//제네릭 사용 이유
//Object는 모든 타입을 받을 수 있으나, 꺼낼 때 형변환이 필요하다
//잘못 꺼낼시 오류가 생길 수 있다.
