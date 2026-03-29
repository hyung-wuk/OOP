package practice.practice260327.practice4;

public class _Account extends practice.practice260327.practice3.Account  {
    public void withdraw(int money){
        if (money > 0 && balance>=money){
            balance -= money;
        }
    }
}
