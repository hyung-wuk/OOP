package practice.practice260430.practice3;

import java.util.ArrayList;

public class Student {
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    void printinfo() {
        System.out.println(name + " : " + score);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("아기굥데렐라",23));
        students.add(new Student("아기굥데렐라2",23));
        students.add(new Student("아기굥데렐라3",23));

        for (Student student : students){
            student.printinfo();
        }
    }
}