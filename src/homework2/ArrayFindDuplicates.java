package homework2;

public class ArrayFindDuplicates {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(i + " " + j);

                if (arr[i] == arr[j]) {

                    System.out.println("match is found" + i + " = " + j);

                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
