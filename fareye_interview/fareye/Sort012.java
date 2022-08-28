package fareye_interview.fareye;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 0, 0, 2, 1};
		System.err.println(Arrays.stream(sort(arr)).boxed().collect(Collectors.toList()));
	}

	private static int[] sort(int[] arr) {
		int zero = 0;
		int i=zero;
		int two = arr.length - 1;
		int one = arr.length - 1;
		@SuppressWarnings("unused")
		int count = 0;
		while(i<one && one<=two)
		{
			count++;
			if(arr[i]==1 || arr[i]==2) {
				while(arr[one]!=0 && i<one)
				{
					count++;
					if(arr[one]==2) {
						int a= arr[two];
						arr[two]=arr[one];
						arr[one]=a;
						two--;
						one--;
					}	
					if(arr[one]==1) {
						one--;
					}
					
				}
			}
			if(arr[one]==0 && i<one) {
				if(arr[i]==1) {
					int a= arr[i];
					arr[i]=arr[one];
					arr[one]=a;
				}
				if(arr[i]==2) {
					int a= arr[i];
					arr[i]=arr[one];
					arr[one]= arr[two];
					arr[two]=a;
					two--;
				}
				one--;
			}	
//			}
//			if(arr[i]==2) {
//				while(arr[one]!=0&&i<one) {
//					if(arr[one]==2) {
//						int a= arr[one];
//						arr[one]=arr[two];
//						arr[two]=a;
//						one--;
//						two--;
//					}
//					if(arr[one]==1) {
//						one--;
//					}
//				}
//				if(arr[one]==0) {
//					int a= arr[i];
//					arr[i]=arr[one];
//					arr[one]= arr[two];
//					arr[two]=a;
//					one--;
//					two--;
//					
//				}	
//				
//			}
//			
//			System.out.println("Count -> "+count);
//			System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
			i++;
		}
		
		return arr;
	}

}
