package Lec_22;

public class Lcs {

	static Integer[][]dp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		String s2="ace";
		dp=new Integer[s1.length()][s2.length()];
		System.out.println(lcs(s1,s2,0,0));
	}

	private static int lcs(String s1, String s2, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i>=s1.length() || j>=s2.length()) {
			return 0;
		}
		
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int common=0;
		int uncommon=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			common=lcs(s1,s2,i+1,j+1)+1;
		}
		else {
			uncommon=Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
		}
		
		return dp[i][j]= Math.max(common, uncommon);
	}

}
