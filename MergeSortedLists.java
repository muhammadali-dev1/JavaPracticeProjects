package lab22;

import java.util.ArrayList;

public class MergeSortedLists {
    public static void main(String[] args) {
        // Test method
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Austin");
        list1.add("Dallas");
        list1.add("San Francisco");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Boston");
        list2.add("Chicago");
        list2.add("Denver");
        list2.add("Seattle");

        ArrayList<String> mergedList = mergeList(list1, list2);

        System.out.println("Merged Sorted List: " + mergedList);
    }

    /**
     * Merges two sorted ArrayLists into a single sorted ArrayList.
     * @param lst1 the first sorted ArrayList
     * @param lst2 the second sorted ArrayList
     * @return a new sorted ArrayList containing all elements from lst1 and lst2
     */
    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two lists while both have remaining elements
        while (i < lst1.size() && j < lst2.size()) {
            if (lst1.get(i).compareTo(lst2.get(j)) <= 0) {
                mergedList.add(lst1.get(i));
                i++;
            } else {
                mergedList.add(lst2.get(j));
                j++;
            }
        }

        // Add remaining elements from lst1
        while (i < lst1.size()) {
            mergedList.add(lst1.get(i));
            i++;
        }

        // Add remaining elements from lst2
        while (j < lst2.size()) {
            mergedList.add(lst2.get(j));
            j++;
        }

        return mergedList;
    }
}
