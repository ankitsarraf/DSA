package search;

public class NormalSearch {

	public static int search(Integer[] array, Integer data) {
		for(int i = 0 ;i <array.length;i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return 0;
	}
	

}
