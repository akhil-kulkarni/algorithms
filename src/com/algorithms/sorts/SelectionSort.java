package com.algorithms.sorts;
import java.util.Arrays;


public class SelectionSort {
	int oArr[];
	public SelectionSort(int[] arr) {
		oArr = arr;
	}
	
	public int[] selectionSort() {
		for(int i=0; i<oArr.length; i++) {
			int min = i;
			for(int j=min+1; j<oArr.length; j++){
				if(oArr[j]<oArr[min]){
					min = j;
				}
			}
			if(min!=i){
				int _min = oArr[min];
				oArr[min] = oArr[i];
				oArr[i] = _min;
			}
		}
		return oArr;
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 5, 4, 6, 8, 3};
		System.out.println("Array: " + Arrays.toString(arr));
		SelectionSort s = new SelectionSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(s.selectionSort()));

	}

}
