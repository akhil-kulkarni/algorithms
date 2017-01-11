package com.algorithms.sorts;
import java.util.Arrays;


public class InsertionSort {
	int oArr[];
	public InsertionSort(int[] arr) {
		oArr = arr;
	}
	
	public int[] insertionSort() {
		for (int i=0; i<oArr.length; i++) {
			int _temp = oArr[i];
			int j = (i-1);
			while (j>=0 && _temp<oArr[j]){
				oArr[j+1] = oArr[j];
				j--;
			}
			oArr[j+1] = _temp;
		}
		return oArr;
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 5, 4, 6, 8, 3};
		System.out.println("Array: " + Arrays.toString(arr));
		InsertionSort s = new InsertionSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(s.insertionSort()));

	}

}
