package practice260305;


public class practice1 {
    public static void main(String[] args) {
        int result = CalculatorPR.sum(10, 20);
        System.out.println(result);
    }
}

class CalculatorPR{
    public static int sum (int left, int right){
        return left + right ;
    }
}