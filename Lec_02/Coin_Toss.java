package Lec_02;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		toss(n,"");
//		System.out.println(tossCount(n,""));
		System.out.println(tossWithoutRepeatingH(n,""));
	}

	private static void toss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss(n-1,ans+"H");
		toss(n-1,ans+"T");
	}
	private static int tossCount(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int a=tossCount(n-1,ans+"H");
		int b=tossCount(n-1,ans+"T");
		return a+b;
	}
	private static int tossWithoutRepeatingH(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		if(ans.length()>0 && ans.charAt(ans.length()-1)=='H') {
			int b=tossWithoutRepeatingH(n-1,ans+"T");			
			return b;
		}
		else {
			int a=tossWithoutRepeatingH(n-1,ans+"H");
			int b=tossWithoutRepeatingH(n-1,ans+"T");
			return a+b;			
		}
		
	}

}
