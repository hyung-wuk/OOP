package practice260305;


public class pratice2 {
    public static void main(String[] args) {

        Calculator2PR c1 = new Calculator2PR();
        c1.setData(10, 20);
        c1.sum();

        Calculator2PR c2 = new Calculator2PR();
        c2.setData(30, 40);
        c2.sum();
    }
}

class Calculator2PR {
    int left, right;

    public void setData(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(left + right);
    }
}