package homework2;

public class PositiveNumbersSum {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 10, -5, -4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                int number = arr[i];
                sum += number;
            }
        }
        System.out.println(sum);
    }
}


