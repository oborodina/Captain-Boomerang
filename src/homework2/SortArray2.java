package homework2;

import java.util.Arrays;
import java.util.Collections;

public class SortArray2 {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println(" ");

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
