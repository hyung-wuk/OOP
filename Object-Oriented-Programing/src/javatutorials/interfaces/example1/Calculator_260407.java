package javatutorials.interfaces.example1;

class Calculator_260407 {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(left+right);
    }
    public void avg(){
        System.out.println((left+right)/2);
    }
}
//1발자가 근데 setOprands가 매개변수를 2개 받게 생각햇고, 2발자는 아까 임의로 사용 로직 만들때 매개변수 3개 받게 설정함!
//아뿔싸!
