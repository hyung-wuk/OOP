package practice.practice260407.practice2;

class Account {
    final void showInfo(){
        System.out.println("showInfo");
    }
}

class SavingAccount extends Account {
    //void showInfo(){}; //에러
}

final class FixedAccount{

}

//class Child extends FixedAccount{
//
//} //에러

//final메서드는 오버라이딩 불가
//final 클래스는 상속 불가
