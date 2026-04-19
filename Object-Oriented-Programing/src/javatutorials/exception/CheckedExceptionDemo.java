package javatutorials.exception;
import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
            String input = bReader.readLine();
            System.out.println(input);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }//버퍼리더를 사용하려면 예외가 강제된다
    }
}
