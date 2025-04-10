package lab17;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySorter {
    public static void sort(int[][] m) {
       
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        });
    }

    public static void main(String[] args) {
        int[][] m = {
            {4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}
        };

        System.out.println("Original array:");
        printArray(m);

        sort(m);

        System.out.println("Sorted array:");
        printArray(m);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

