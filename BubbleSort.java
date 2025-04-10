package lab12;

public class BubbleSort {


public static void bubbleSort(double[] list) {
    boolean changed = true;
    do {
        changed = false;
        for (int j = 0; j < list.length - 1; j++) {
            if (list[j] > list[j + 1]) {
                // Swap list[j] with list[j + 1]
                double temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                
                changed = true;
            }
        }
    } while (changed);
}

public static void main(String[] args) {
    double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
    
    System.out.println("Before sorting:");
    for (double num : list) {
        System.out.print(num + " ");
    }
    
    bubbleSort(list);
    
    System.out.println("\n\nAfter sorting:");
    for (double num : list) {
        System.out.print(num + " ");
    }
}
}