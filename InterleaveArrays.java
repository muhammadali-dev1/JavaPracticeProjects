// Muhammad Ali
// 115921494

package homework4;
import java.util.Arrays;

public class InterleaveArrays {


	    public static void main(String[] args) {

	        // Test cases

	        test(new int[]{1, 3, 5}, new int[]{2, 4, 6});

	        test(new int[]{10, 20, 30, 40, 50, 60, 70, 80}, new int[]{2, 4, 6, 8});

	        test(new int[]{1, 3, 5}, new int[]{2, 4, 6, 8, 10});

	        // Additional test cases

	        test(new int[]{}, new int[]{2, 4, 6, 8, 10});

	        test(new int[]{1, 2, 3}, new int[]{});

	    }

	    public static void test(int[] array1, int[] array2) {

	        System.out.println("interleaveArrays(" + Arrays.toString(array1) + ", " + Arrays.toString(array2) + ") returns " + Arrays.toString(interleaveArrays(array1, array2)));

	    }

	    public static int[] interleaveArrays(int[] array1, int[] array2) {

	        int[] result = new int[array1.length + array2.length];

	        int i = 0, j = 0, k = 0;

	        while (i < array1.length && j < array2.length) {

	            result[k++] = array1[i++];

	            result[k++] = array2[j++];

	        }

	        while (i < array1.length) {
	            result[k++] = array1[i++];
	        }
	        while (j < array2.length) {

	            result[k++] = array2[j++];
	        }
	        return result;
	    }
	}

