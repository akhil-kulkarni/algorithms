package com.algorithms.sorts;
import java.util.Arrays;

public class QuickSort {
	int oArr[];
	int length;
	public QuickSort(int arr[]) {
		oArr = arr;
		length = arr.length-1;
	}
	
	public int[] quickSort() {
		pivotAndSort(0, oArr.length);
		return oArr;
	}
	
	public void pivotAndSort(int start, int end){
		if((end-start)<=1){
			return;
		}
		int pivotIndex = fixPivotInPlace(start, end);
		pivotAndSort(start, pivotIndex);
		pivotAndSort((pivotIndex+1), end);
	}
	
	public int fixPivotInPlace(int start, int end){
		int pivotIndex = end - 1;
		for(int i=start; i<end; i++){
			if((oArr[i]<oArr[pivotIndex] && pivotIndex<i) || (oArr[i]>oArr[pivotIndex] && pivotIndex>i)){
				int _temp = oArr[pivotIndex];
				oArr[pivotIndex] = oArr[i];
				oArr[i] = _temp;
				pivotIndex = i;
			}
		}
		return pivotIndex;
	}

	public static void main(String[] args) {
		int arr[] = {9, 5, 4, 6, 8, 3};
		System.out.println("Array: " + Arrays.toString(arr));
		QuickSort q = new QuickSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(q.quickSort()));
	}
}
