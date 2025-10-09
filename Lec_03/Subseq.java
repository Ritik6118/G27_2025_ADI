package Lec_03;


public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		subseq("abc","");
		subseq("abc","",0);
	}

	private static void subseq(String s, String ans, int i) {
		// TODO Auto-generated method stub
		if(i==s.length()) {
			System.out.println(ans);
			return;
		}
		
		subseq(s,ans,i+1); // not pick
		subseq(s,ans+s.charAt(i),i+1); // pick 
	}

	private static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		subseq(s.substring(1),ans+s.charAt(0)); // pick
		subseq(s.substring(1),ans);             // not pick
	}

}
