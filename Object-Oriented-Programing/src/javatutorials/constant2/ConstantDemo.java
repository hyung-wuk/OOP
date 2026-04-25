package javatutorials.constant2;

//class Fruit{
//    public static final Fruit Apple = new Fruit();
//    public static final Fruit Peach = new Fruit();
//    public static final Fruit Banana = new Fruit();
//}

enum Fruit {
    Apple("red",1000), Peach("pink",2000), Banana("yellow",3000);//위의 것과 정확히 같은 코드이다!! 이것도 클래스임
    private String color;
    private int price;
    String getcolor() {
        return color;
    }
    int getprice() {
        return price;
    }

    Fruit(String color, int price) {
        System.out.println("Call Constructor" + this);
        this.color = color;
        this.price = price;
    }//enum도 클래스이기 때문에 생성자를 만들 수 있다.
    //컬러 값을 받는 생성자로 만들어보자
    //위에 String 데이터타입의 컬러값을 담는 지역 변수를 만들어 주고
    //상수들 옆에 괄호를 열고 색깔을 적는다. 이것의 의미는 생성자를 호출하는 것이au
    //괄호 안의 값은 그 매개변수이다


    // 출력값 :
//    Call Constructor
//    Call Constructor
//    Call Constructor
//    57 칼로리
    // 위의 출력 값이 가지는 의미는 enum클래스에서 위처럼 상수들을 열거 한 것이
    // 그위에 클래스에서 상수들을 지정해 준것과 동일 한 것이라는 것을 증명하고 있는것이다.
    // 우리가 상수를 하나하나 만들때마다 인스턴스가 생성 되고, 인스턴스가 생성 될때마다
    // 생성자가 호출이 되는데 이를 눈으로 보기 위해 기본 생성자에 출력문을 추가한것
    // 아래 메인에서 Fruit를 호출 했고, 그 안에 있는 상수들이 3개 있기 때문에
    // 3번 인스턴스화 돼고! 3번 생성자가 호출 된것을 보이기 위해 한것!!!
    // 상수가 4개라면 4번 호출 되겠지!

}//enum class는 인스턴스를 만들 수 없고, 상속을 방지한다. 이는 열거를 위한 클래스이기 때문이다

//class Company{
//    public static final Company Google = new Company();
//    public static final Company Apple = new Company();
//    public static final Company Oracle = new Company();
//}

enum Company{
    Google, Apple, Banana;
}

public class ConstantDemo {
//    private final static int Fruit_Apple = 1;
//    private final static int Peach = 2;
//    private final static int Banana = 3;
//
//    private final static int Google = 1;
//    //private final static int Comapny_Apple = 2; //1.final로 지정되어 있기 때문에 바꿀수 없음
                                            //이럴땐 접두사를 붙여서 구분하는게 흔함
                                            //근데 그럼 너무 더러워 지니까 클래스 소속 필드로 만들자
//    private final static int Oracle = 3;

    public static void main(String[] args) {

//        if(Fruit.Apple == Company.Apple){
//            System.out.println("Same Apple");
//        }//애초에 비교조차 불가능해야하기에 클래스를 이용하여 데이터 타입을 다르게 함

        Fruit type = Fruit.Apple;
        switch(type){//스위치문에 Fruit, Company 데이터 타입 사용 불가 ㅠㅜ 힘들게 만들었는데ㅠㅜ
            case Apple:
                System.out.println(57 + " 칼로리 , color : " + Fruit.Apple.getcolor() + " , price : " + Fruit.Apple.getprice());
                break;
            case Peach:
                System.out.println(34 + " 칼로리 , color : " + Fruit.Peach.getcolor() + " , price : " + Fruit.Peach.getprice());
                break;
            case Banana:
                System.out.println(93 + " 칼로리 , color : " + Fruit.Banana.getcolor()  + " , price : " + Fruit.Banana.getprice());
                break;
        }

        for(Fruit f : Fruit.values()){ //values로 열거형 안에있는 상수들을 꺼내 올 수 있다.
            System.out.println(f);
        }
    }
}
