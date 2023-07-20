package Programs;

public class CyclicRotate {
	public static void rotate(int[] arr, int n) {
		int temp = arr[n-1];
		for (int i = n-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,-2,5};
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		rotate(arr, n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
