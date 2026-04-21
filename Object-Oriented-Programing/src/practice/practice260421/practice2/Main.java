package practice.practice260421.practice2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();
            System.out.println(input);
        }catch(IOException e){
            System.out.println("입출력 오류 발생");
        }
    }
}
