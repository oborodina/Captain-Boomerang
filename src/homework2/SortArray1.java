package homework2;

public class SortArray1 {
    public static void main(String[] args) {

        Integer[] arrayToSort = {2, 3, 1, 7, 11};
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        System.out.println(" ");

        for (int j = arrayToSort.length - 1; j >= 0; j--) {
            System.out.print(arrayToSort[j] + " ");
        }
    }
}
