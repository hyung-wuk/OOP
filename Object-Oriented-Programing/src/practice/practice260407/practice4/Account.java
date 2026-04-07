package practice.practice260407.practice4;

class Account implements Printable {
    int balance;
    Account(int blance){
        this.balance = blance;
    }
    @Override
    public void printInfo(){
        System.out.println("일반 계좌 잔액 : " + this.balance);
    }
}
