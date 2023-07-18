
package Programs;

import java.util.*;

public class BinarySearch {

	public static int binarySearch(int[] arr, int n, int k) {
		int low = 0,high = n-1;
		while(low <= high) {
			int mid = (low - (low-high)/2);
			if(k == arr[mid]) {
				return mid;
			} else {
				if (k > arr[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();	
		}
		
		System.out.println("entered array: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("sorted array: ");
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.print("enter the element to search the index: ");
		int k = s.nextInt();
		
		System.out.println("the element is on "+binarySearch(arr,n,k)+" index.");
	}

}
