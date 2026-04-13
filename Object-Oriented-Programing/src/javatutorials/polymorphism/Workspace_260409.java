package javatutorials.polymorphism;

interface father{}
interface mother{}
interface programmer{
    public void coidng();
}
interface believer{}

class Steve implements father,programmer,believer{
    public void coidng(){
        System.out.println("fast");
    }
}
class Rachel implements mother,programmer{
    public void coidng(){
        System.out.println("elegance");
    }
}
public class Workspace_260409 {
    public static void main(String[] args) {
        programmer employee1 = new Steve();
        programmer employee2 = new Rachel();

        employee1.coidng();
        employee2.coidng();
    }
}
