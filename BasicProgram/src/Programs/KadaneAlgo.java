//Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

package Programs;

public class KadaneAlgo {

	public static int maxSubarraySum(int arr[], int n){
        
        int maxSum = Integer.MIN_VALUE, sum = 0;
        // maxSum --> stores the maximum sum of contiguous subarray found so far.
        // sum --> stores the maximum sum of contiguous subarray ending at current index.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n = 5;
		int[] arr = {1,2,3,-2,5};
		System.out.println("Max sum is : "+maxSubarraySum(arr, n));
	}

}
