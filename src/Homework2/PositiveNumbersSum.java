package Homework2;

public class PositiveNumbersSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, -3, -5, -4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}


