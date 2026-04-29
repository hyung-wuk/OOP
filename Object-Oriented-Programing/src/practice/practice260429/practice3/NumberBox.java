package practice.practice260429.practice3;

public class NumberBox <T extends Number>{
    private T value;
    public NumberBox(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public double getDoubleValue(){
        return value.doubleValue();
    }
}
