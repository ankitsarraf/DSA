package fareye_interview.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7, 1}; 
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int init, int last) {
		if(last-init>=0) {
			int partition = partition(arr,init,last);
			quickSort(arr, init, partition-1);
			quickSort(arr, partition+1,last);
		}

		System.err.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
	}

	private static int partition(int[] arr, int init, int last) {
		int pivot = arr[last];
		int pointerToSmall = init-1;
		for(int i=init;i<last;i++) {
			if(arr[i]<pivot) {
				pointerToSmall++;
				int a = arr[pointerToSmall];
				arr[pointerToSmall] = arr[i];
				arr[i] = a;
			}
		}
		pointerToSmall++;
		int a = arr[pointerToSmall];
		arr[pointerToSmall] = arr[last];
		arr[last] = a;
		arr[pointerToSmall] = pivot;
		System.err.println("-> "+Arrays.stream(arr).boxed().collect(Collectors.toList()));
		return pointerToSmall;
	}


}
