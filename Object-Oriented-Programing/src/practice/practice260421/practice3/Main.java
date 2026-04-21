package practice.practice260421.practice3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 범위를 벗어났습니다." + e.getMessage());
        }
    }
}
