package javatutorials.exception;

import java.io.*;

class B{
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

class C{
    void run() throws FileNotFoundException, IOException{
        B b = new B();
        b.run();
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
//        }catch (FileNotFoundException e){
//            e.printStackTrace(); //FileNotFoundException의 조상 클래스가 IOException이기 때문에
                                   //없어도 실행됨
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
