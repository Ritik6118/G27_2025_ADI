package Lec_04;

import java.util.ArrayList;
import java.util.List;

public class KeypadCodesLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
		
	}
	
	static String [] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static List<String> letterCombinations(String digits) {
		List<String> li=new ArrayList<>();
		solve(digits,li,"");
		return li;
	}


	private static void solve(String digits, List<String> li, String ans) {
		// TODO Auto-generated method stub
		
		if(digits.length()==0) {
			li.add(ans);
			return;
		}
		
		char ch=digits.charAt(0);
		int idx=ch-'0';
		String s=arr[idx];
		for(int i=0;i<s.length();i++) {
			solve(digits.substring(1),li,ans+s.charAt(i));
		}
	}

}
 