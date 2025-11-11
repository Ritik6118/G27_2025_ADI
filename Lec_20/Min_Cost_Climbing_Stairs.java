package Lec_20;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,15,20};
		System.out.println(minCostClimbingStairs(arr));
	}
	static Integer[] dp;
	public static int minCostClimbingStairs(int[] cost) {
		dp=new Integer[cost.length];
		return Math.min(solve(cost,0),solve(cost,1));
	}

	private static int solve(int[] cost, int i) {
		// TODO Auto-generated method stub
		
		if(i>=cost.length) {
			return 0;
		}
		
		if(dp[i]!=null) {
			return dp[i];
		}
		
		int a=solve(cost,i+1)+cost[i];
		int b=solve(cost,i+2)+cost[i];
		
		
		return dp[i]=Math.min(a, b);
	}

}
