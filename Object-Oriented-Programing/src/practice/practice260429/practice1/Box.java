package practice.practice260429.practice1;

public class Box <T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
