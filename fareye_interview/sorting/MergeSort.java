package fareye_interview.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {
	
//	public static int[] mergeSort(int[] arr,int init,int end) {
////		if(init<=end) {
//			if(end-init>0) {
//				int mid = (init+end)/2;
//				//{12, 11, 13, 5, 6, 7, 1};
//				int[] left = mergeSort(arr,init,mid);
//				int[] right = mergeSort(arr,mid+1,end);
//				System.err.println(Arrays.stream(left).boxed().collect(Collectors.toList()));
//				System.err.println(Arrays.stream(right).boxed().collect(Collectors.toList()));
//				arr = merge(left,right);
//				System.err.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
//				return arr;
//			}else {
//				return new int[] {arr[init]};
//			} 
////		}
//
//		
//	}
//	private static int[] merge(int[] left, int[] right) {
//		int[] newArr = new int[left.length+right.length];
//		int i=0,j=0,k=0;
//		System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
//		while(k<newArr.length) {
//			if(j>=right.length) {
//				newArr[k++] = left[i++];
//				
//			}else if(i>=left.length) {
//				newArr[k++] = right[j++];
//			}
//			else {
//					if(left[i] < right[j]) {
//							newArr[k++] = left[i++];
//
//					}else {
//							newArr[k++] = right[j++];
//					}
//						System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
//			}
//		}
////		while(k<newArr.length) {
////			if(j>=right.length) {
////				newArr[k++] = left[i++];
////				
////			}else if(i>=left.length) {
////				newArr[k++] = right[j++];
////			}
////			else {
////					if(left[i] < right[j]) {
////						while( i<left.length && j<right.length && left[i] < right[j]) {
////							newArr[k++] = left[i++];
////							System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
////						}
////						newArr[k++] = right[j++];
////						System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
////
////					}else {
////						while( i<left.length && j<right.length&& left[i] > right[j]) {
////							newArr[k++] = right[j++];
////							System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
////
////						}
////						newArr[k++] = left[i++];
////						System.err.println(Arrays.stream(newArr).boxed().collect(Collectors.toList()));
////					}
////				}
////		}
//		return newArr;
//	}
	
	public static void mergeSort(int[] arr,int init,int end) {
		if(end-init>0) {
				int mid = (init+end)/2;
				//{12, 11, 13, 5, 6, 7, 1};
				mergeSort(arr,init,mid);
				mergeSort(arr,mid+1,end);
//				System.err.println(Arrays.stream(left).boxed().collect(Collectors.toList()));
//				System.err.println(Arrays.stream(right).boxed().collect(Collectors.toList()));
				merge(arr,init,mid,end);
				System.err.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		}
		
	}
	private static void merge(int[] arr, int init, int mid, int end) {
		int[] left = new int[mid-init+1];
		int[] right = new int[end-mid];
		for(int i=0;i<left.length;i++) {
			left[i] = arr[init+i];
		}
		for(int i=0;i<right.length;i++) {
			right[i] = arr[mid+1+i];
		}
		System.err.println(Arrays.stream(left).boxed().collect(Collectors.toList()));
		System.err.println(Arrays.stream(right).boxed().collect(Collectors.toList()));
		int i=0,j=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				arr[init++] = left[i++];
			}
			else {
				arr[init++] = right[j++];
			}
		}
		while(i<left.length) {
			arr[init++] = left[i++];
		}
		while (j<right.length) {
			arr[init++] = right[j++];			
		}	
	}



	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7, 1}; 
		mergeSort(arr,0,arr.length-1);
//		System.err.println(Arrays.stream(mergeSort(arr,0,arr.length-1)).boxed().collect(Collectors.toList()));
	}

}
