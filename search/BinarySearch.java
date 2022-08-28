package search;

public class BinarySearch {
	
	public static int search(Integer[] array, Integer data, int start, int end) {
		if(start<=end) {
			int mid = (start + end) /2;
			if(array[mid] == data) {
				return mid;
			}else if(data > array[mid]) {
				return search(array, data, mid + 1, end);
			} else {
				return search(array, data, start, mid -1);	
			}
		}
		return -1;	
	}
	public static void main(String...s) {
		Integer[] arr = new Integer[] {1,2,3,42,50,61,72,83,94};
		System.out.println(search(arr,94,0,arr.length-1));
	}
}
