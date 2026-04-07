package practice.practice260407.practice4;

class SavingAccount implements Printable{
    int balance;
    SavingAccount(int balance){
        this.balance = balance;
    }
    @Override
    public void printInfo(){
        System.out.println("저축 계좌 잔액 : " + this.balance);
    }
}
