package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	Random rand = new Random();
    	int[] sortedArray;
    	sortedArray = array;
    	for(int i = 0; i<sortedArray.length; i++) {
    		for(int k = 0; k<sortedArray.length-1; k++) {
    			if(sortedArray[k]>sortedArray[k+1]) {
                    int temp = sortedArray[k];
                    sortedArray[k] = sortedArray[ k+1 ];
                    sortedArray[ k+1 ] = temp;
    			}
    		}
    	}
    	while(array != sortedArray) {
    		int j = rand.nextInt(array.length);
    		int b = rand.nextInt(array.length);
            int temp = array[j];
            array[j] = array[b];
            array[b] = temp;
            display.updateDisplay();
    	}
    }
}
