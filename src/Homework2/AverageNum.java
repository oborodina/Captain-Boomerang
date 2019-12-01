package Homework2;

public class AverageNum {
    public static void main(String[] args) {
        int [] arr = {4, 1, 1, 5, 5};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avr = sum / arr.length;

        System.out.println(avr);
    }
}
