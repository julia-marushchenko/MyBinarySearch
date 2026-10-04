/**
 *  Binary search.
 */

package com.mycollections;

import java.util.ArrayList;

public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a list with numbers.
        ArrayList<Integer> myList = new ArrayList<>();

        // Adding elements.
        myList.add(2);
        myList.add(1);
        myList.add(6);
        myList.add(4);
        myList.add(8);
        myList.add(3);
        myList.add(11);

        // Calling method to find index of element 4.
        System.out.println(binarySearch(myList, 4)); // Output: 3

        // Calling method to find index of element 11.
        System.out.println(binarySearch(myList, 11)); // Output: 6

        // Calling method to find index of element 6.
        System.out.println(binarySearch(myList, 1)); // Output: 1
    }

    public static int binarySearch(ArrayList<Integer> list, int searched) {

        int first = 0;
        int last = list.size() - 1;

        int index = -1;

        while (first <= last) {
            int middle = (first + last) / 2;

            if(list.get(middle) == searched) {
                index = middle;
                break;
            } else if(list.get(middle) < searched) {
                first = middle + 1;
            } else if(list.get(middle) > searched) {
                last = middle - 1;
            }
        }
        return index;
    }
}