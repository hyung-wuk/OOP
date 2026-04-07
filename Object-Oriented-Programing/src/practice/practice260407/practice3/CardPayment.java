package practice.practice260407.practice3;

public class CardPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("카드 결제");
    }
}

class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("현금 결제");
    }
}
