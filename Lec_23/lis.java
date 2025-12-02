package Lec_23;

public class lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(arr));
	}

	static Integer[][] dp;
	public static int lengthOfLIS(int[] nums) {
		dp=new Integer[nums.length][nums.length+1];
		return solve(nums,0,-1);
	}

	private static int solve(int[] arr, int curr, int prev) {
		// TODO Auto-generated method stub
		if(curr==arr.length) {
			return 0;
		}
		if(dp[curr][prev+1]!=null) {
			return dp[curr][prev+1];
		}
		
		int pick=0;
		if(prev==-1 || arr[curr]>arr[prev]) {
			pick=solve(arr,curr+1,curr)+1;			
		}
		int notpick=solve(arr,curr+1,prev);
		
		return dp[curr][prev+1]=Math.max(pick, notpick);
		
	}

}
