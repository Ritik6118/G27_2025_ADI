package Lec_03;

public class Board_path_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int d=3;
		solve(n,d,"");
	}

	private static void solve(int n, int d, String ans) {
		// TODO Auto-generated method stub
		if(d==0) {
			System.out.println(ans);
			return;
		}
//		if(d<0) {
//			return;
//		}
		
		for(int i=1;i<=n;i++) {
			
			if(d-i>=0) {
				solve(n,d-i,ans+" "+i);				
			}
		}
	}

}
