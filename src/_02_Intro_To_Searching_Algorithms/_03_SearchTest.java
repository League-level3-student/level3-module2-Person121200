package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	 String[] arr = {"apple", "banana", "cherry"};
    	 String[] arr1 = {"a", "b", "b", "d"};
    	 String[] arr2 = {"hello", "bye", "DUDEMAN"};
         assertEquals(_01_LinearSearch.linearSearch(arr, "cherry"), 2);
         assertEquals(_01_LinearSearch.linearSearch(arr1, "b"), 1);
         assertEquals(_01_LinearSearch.linearSearch(arr2, "DUDEMAN"), 2);

    }

    @Test
    public void testBinarySearch() {
   	 int[] arr = {1, 2, 3};

        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(_02_BinarySearch.binarySearch(arr, 1, 3, 2), 1);
    }
}
