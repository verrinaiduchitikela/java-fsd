package chaithanya.java.assignment.com;

public class LIS {
	static int max_ref; // stores the LIS
	   static int _lis(int arr[], int n)
	    {
	        // base case
	        if (n == 1)
	            return 1;
	  
	        // 'max_ending_here' is length of LIS ending with arr[n-1]
	        int res, max_ending_here = 1;
	  
	       
	        for (int i = 1; i < n; i++) {
	            res = _lis(arr, i);
	            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
	                max_ending_here = res + 1;
	        }
	  
	        // Compare max_ending_here with the overall max. And
	        // update the overall max if needed
	        if (max_ref < max_ending_here)
	            max_ref = max_ending_here;
	  
	        // Return length of LIS ending with arr[n-1]
	        return max_ending_here;
	    }
	  
	    // The wrapper function for _lis()
	    static int lis(int arr[], int n)
	    {
	        // The max variable holds the result
	        max_ref = 1;
	  
	        // The function _lis() stores its result in max
	        _lis(arr, n);
	  
	        // returns max
	        return max_ref;
	    }
	  
	    // driver program to test above functions
	    public static void main(String args[])
	    {
	        int arr[] = { 1, 50, 41, 60 };
	        int n = arr.length;
	        System.out.println("Length of length of increasing subsequence is: "
	                           + lis(arr, n) + "\n");
	    }
}
