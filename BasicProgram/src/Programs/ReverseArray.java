package Programs;

public class ReverseArray {

	public static void reverse(int arr[], int n){
        int i = 0, j = n-1;
        	
        while(i<=j) {
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
        	i++;
        	j--;	
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,-2,5};
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		reverse(arr,n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
