package practice.practice260429.practice3;

public class Main {
    public static void main(String[] args) {
        NumberBox <Integer> n = new NumberBox<>(100);
        NumberBox<Double> n1 = new NumberBox<>(10.0);
        //NumberBox<String> n2 = new NumberBox<>("응 안돼");
    }
}//T extends Number 은 Number계열만 허용
//Integer, Double은 가능
//String은 불가능