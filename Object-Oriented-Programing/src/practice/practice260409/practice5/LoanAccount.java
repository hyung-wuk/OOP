package practice.practice260409.practice5;

public class LoanAccount implements Printable{
    int debt;

    LoanAccount(int debt){
        this.debt = debt;
    }

    @Override
    public void printInfo(){
        System.out.println("대출 계좌 부채 : " + debt);
    }
}
