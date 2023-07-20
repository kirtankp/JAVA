package Programs;

import java.util.*;

public class MinimizeTheHeight {

	public static int minimize(int[] arr,int n,int k) {
		Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        int min, max;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;

            min = Math.min(arr[i] - k, arr[0] + k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, max - min);
        }
        return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1, 5, 8, 10};
		int n = height.length;
		int k = 2;//increase or decrease by k
		
		System.out.println("the answer is :"+minimize(height, n, k));
	}

}
