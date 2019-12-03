package homework2;

public class AverageNum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 5, 5};
        double sum = 0;
        int length = arr.length;

        for (int i : arr) {
            sum += i;
        }
        double avr = sum / length;

        System.out.println(avr);
    }
}