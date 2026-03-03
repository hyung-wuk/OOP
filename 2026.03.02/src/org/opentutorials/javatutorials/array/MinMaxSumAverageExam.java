package org.opentutorials.javatutorials.array;

public class MinMaxSumAverageExam {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 10, 1, 8, 5};

        int min = numbers[0]; //초기값을 배열의 첫번째 요소로

        int max = numbers[0];

        int sum= 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) { //최소값 찾기
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        double avg = (double)sum / numbers.length;

        System.out.println("The average is " + avg);
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        System.out.println("The sum is " + sum);
    }
}
