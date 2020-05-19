/**
 * SelectionSortMod.java
 */
package assignment6;

import java.util.*;

// BJP5 p 888 13.4, 5: Algorithm Analysis
/**
 * 13.4: method mystery1 is an O(N) algorithm, belonging to the linear complexity class.
 * 
 * Explanation: Although arrays can present complexity issues as they are given default
 * zero values on construction, this particular method creates the longer array N outside
 * of the loop. There is a single loop that modifies the default values of the longer array within
 * half the iterations and two simple statements. Although the loop is shorter, it still has to modify 
 * all of the results elements, which is expressed as N. "A loop that contains K simple statements 
 * and repeats N times will have a runtime of approx. (K * N)" (p 853). There is no higher power of N
 * than the loop
 * 
 * 13.5: method mystery2 is also an O(N) algorithm, belonging to the linear complexity class.
 * 
 * Explanation: The method contains a singular loop that uses the array length variable of 'list'
 * to set its number of iterations to half of that length. The loop's two simple statements
 * that access / modify array elements is the code that is most frequently executed. Although there
 * are fewer iterations, all of the values of the array 'list' are being modified as the method is 
 * implementing a swap. This modification happens just once, which as above can be expressed as (K * N)
 * or 2 * N, which is linear.
 * 
 * BJP5 p890 13.18: method modSelectionSort (implemented and tested below) is an O(N^2) algorithm, 
 * belonging to the linear complexity class like the standard selection sort algorithm presented in 
 * this chapter. 
 * Although no additional loops or statements were required, I predict that it is of equivalent speed
 * to the standard version. This modified version also requires a nested loop to compare values, which
 * looped N times for each iteration of the containing loop N.
 */
// 
/**
 * @author Nora P.
 * @version 05-17-20 
 * This program tests a modified version of the selection sort algorithm. Instead of
 * searching for the smallest element and moving it to the beginning of the passed array,
 * this version selects the LARGEST element on each pass and moves it to the array's END.
 */
public class SelectionSortMod {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {16, 8, 8, 18, 11, 2, 4, 13, 7, 17}; // hard coding original array for clarity
		System.out.println("Original array: " + Arrays.toString(numbers));
		
		// Test method, tracking duration of the method sorting
		long start = System.currentTimeMillis();
		modSelectionSort(numbers);
		double elapsed1 = (System.currentTimeMillis() - start) / 1000.0;
		
		// Output duration and verify that array is sorted
		System.out.println("Method duration: " + elapsed1 + " seconds");
		System.out.println("After running modSelectSort: " + Arrays.toString(numbers));
	} ///// END MAIN //////
	 
	/**
	 * swaps a[i] with a[j] --> moves larger value to the back
	 * @param a - the array storing elements to swap
	 * @param i - the smaller index
	 * @param j - the larger index
	 */
	public static void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	/**
	 * Modified version of the selection sort algorithm, that searches for the largest value
	 * by comparing it with the other array values, if a larger value is found
	 * the swap method is called, moving the larger value to the index closer to the end with the
	 * largest and the end
	 * @param a - the array to sort
	 */
	public static void modSelectionSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) { // loops backwards
			int largest = i; // start with last element index as largest
			for (int j = i - 1; j >= 0; j--) { // nested loop necessary to evaluate if largest is holding the correct value
				if (a[j] > a[largest]) { 
					largest = j; // updates largest if another value is greater
				}
			}
			swap(a, i, largest);
		}
	}
	
//	EX: 13.4
//	public static int[] mystery1(int[] list) {
//		int[] result = new int[2 * list.length]; // initializes array at double length 2K 
//		for (int i = 0; i < list.length; i++) { // single loop
//			result[2 * i] = list[i] / 2 + list[i] % 2; // s.s.
//			result[2 * i + 1] = list[i] / 2; // s.s.
//		}
//		return result; // s.s.
//	}
//	EX: 13.5
//	public static void mystery2(int[] list) { 
//		for (int i = 0; i < list.length / 2; i++) { // (k/2)
//			int j = list.length - 1 - i; // s.s. 1
//			int temp = list[j]; // s.s. 1
//			list[i] = list[j]; // s.s. 1
//			list[j] = temp; // s.s. 1
//		}
//	}

} // END CLASS
