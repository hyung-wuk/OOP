package javatutorials.accesmodifier.SamePackage;

import javatutorials.accesmodifier.OtherPackage.Other_260328;

class SameClassChecker_260328{
    public SameClassChecker_260328(){
        //같은 클래스
        this._private();
        this._public();
        this._protected();
        this._default();
    }
    private void _private(){
        System.out.println("This is a private method");
    }

    public void _public(){
        System.out.println("This is a public method");
    }

    protected void _protected(){
        System.out.println("This is a protected method");
    }

    void _default(){
        System.out.println("This is a default method");
    }
    //같은 클래스 안에서는 접근제어자의 유형 여부 없이 접근 가능
}

class SamePackegeChecker_260328 extends Same_260328{
    SamePackegeChecker_260328(){
        //같은 패키지
        Same_260328 same = new Same_260328();
        same._public();
        same._protected();
        same._default();
        //same._private();

        //같은 패키지 상속 관계
        this._public();
        this._protected();
        this._default();
        //this._private();
    }
}

class OtherPackageChecker_260328 extends Other_260328{
    OtherPackageChecker_260328(){
        //다른 패키지
        Other_260328 other = new Other_260328();
        other._public();
        //other._protected();
        //other._default();
        //other._private();

        //다른 패키지, 서브 클래스
        this._protected();
        this._public();
        //this._default();
        //this._private();
    }
}

public class Checker_260328 {
    public static void main(String[] args) {
    }
}
