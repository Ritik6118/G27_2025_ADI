package Lec_23;

public class Min_Cost_Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9,10,30,31};
		int [] arr2= {2,7,15};
		System.out.println(mincostTickets(arr,arr2));
	}

	static Integer [] dp;
	public static int mincostTickets(int[] days, int[] costs) {
		dp=new Integer[366];
		int [] freq=new int [366];
		for(int i:days) {
			freq[i]++;
		}
		return solve(freq,costs,1);
	}

	private static int solve(int[] days, int[] costs, int i) {
		// TODO Auto-generated method stub
		if(i>=days.length) {
			return 0;
		}
		if(dp[i]!=null) {
			return dp[i];
		}
		int pick=99999;
		int notpick=99999;
		if(days[i]!=0) {
			pick=Math.min(pick, solve(days, costs, i+1)+costs[0]);
			pick=Math.min(pick, solve(days, costs, i+7)+costs[1]);
			pick=Math.min(pick, solve(days, costs, i+30)+costs[2]);
		}
		else {
			notpick=solve(days,costs,i+1);
		}
		
		return dp[i]=Math.min(pick, notpick);
	}

}
