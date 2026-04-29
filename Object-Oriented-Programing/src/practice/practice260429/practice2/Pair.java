package practice.practice260429.practice2;

public class Pair <T, S>{
    private T key;
    private S value;

    Pair(T key, S value){
        this.key = key;
        this.value = value;
    }

    void print(){
        System.out.println(key + " : " + value);
    }
}
