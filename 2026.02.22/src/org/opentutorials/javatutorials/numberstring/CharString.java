package org.opentutorials.javatutorials.numberstring;

public class CharString {
    public static void main(String[] args) {
        System.out.println('생');//문자는 단따옴표
        System.out.println("생활코딩"); //문자열은 큰따옴표
        System.out.println("생");//쌍따옴표로 묶이면 문자열 한개라도 문자열
        System.out.println("생활코딩" + "입니다.");//문자열도 더할수 있음
        System.out.println("1"+"1");
        //System.out.println("egoing said"Welcome programing world""); //안됨
        System.out.println("egoing said\"Welcome programing world\"");//문자열 안에 쌍따옴표 넣고싶으면 쌍따 앞에 역슬래쉬 사용하면 됨
        System.out.println("egoing said\n\"Welcome programing world\""); //한줄 내리고 싶으면 역슬n
    }
}
