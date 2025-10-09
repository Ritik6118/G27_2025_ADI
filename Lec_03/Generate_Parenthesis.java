package Lec_03;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(generate(n,0,0,""));
	}
	
	static List<String> li=new ArrayList<>();
		
	private static  List<String> generate(int n, int o, int c, String ans) {
		// TODO Auto-generated method stub
		if(o==n && c==n) {
//			System.out.println(ans);
			li.add(ans);
		}
		
		if(o<n) {
			generate(n,o+1,c,ans+"(");
		}
		if(o>c) {
			generate(n,o,c+1,ans+")");
		}
		
		return li;
	}

}
