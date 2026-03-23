package org.opentutorials.javatutorials.packages.example2;

import org.opentutorials.javatutorials.packages.example1.*;
// 뒤에 * 붙이면 그 패키지에 있는 모든 클래스를 로드함
public class B {
    public static  void main(String[] args) {
        A a = new A();
    }
}
