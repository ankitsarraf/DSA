package fareye_interview.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort2 {
	static int arrange(int[] arr,int init,int last) {
		int pivot = arr[last];
		int j = init;
		for(int i=init;i<last;i++) {
			
			if(arr[i]<pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		int temp = arr[last];
		arr[last] = arr[j];
		arr[j] = temp;
//		System.err.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		return j;
	}
	static void sort(int[] arr,int init,int last) {
		if(init<last) {
			int middle = arrange(arr,init,last);
			sort(arr,init,middle-1);
			sort(arr,middle+1,last);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6, 17, 8}; 
		sort(arr,0,arr.length-1);
		System.err.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));

	}

}
