package com.algorithms.sorts;
import java.util.Arrays;

public class MergeSort {
	int oArr[], dArr[];
	int length;
	public MergeSort(int arr[]) {
		oArr = arr;
		dArr = Arrays.copyOf(arr, arr.length);
		length = arr.length-1;
	}
	
	public int[] mergeSort() {
		this.divideAndSort(0, length);		
		return oArr;
	}
	
	public void divideAndSort(int start, int end) {
		if((end-start) < 1){
			return;
		}
		int middle = ((start + end)/2);
		this.divideAndSort(start, middle);
		this.divideAndSort((middle+1), end);
		this.sort(start, middle, end);
	} 
	
	public void sort(int start, int middle, int end) {
		int i = start, j = (middle+1);
	    for (int k = start; k <= end; k++) {
	        // If left run head exists and is <= existing right run head.
	        if (i <= middle && (j > end || dArr[i] <= dArr[j])) {
	            oArr[k] = dArr[i];
	            i++;
	        }
	        else {
	            oArr[k] = dArr[j];
	            j++;
	        }
	    }
	    dArr = Arrays.copyOf(oArr, oArr.length);
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 5, 4, 6, 8, 3};
		System.out.println("Array: " + Arrays.toString(arr));
		MergeSort m = new MergeSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(m.mergeSort()));
	}
}
