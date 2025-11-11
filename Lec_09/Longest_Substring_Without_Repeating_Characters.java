package Lec_09;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int si=0;
		int ei=0;
		int [] arr=new int [128];
		int ans=0;
		while(ei<s.length()) {
			char ech=s.charAt(ei);
			arr[ech]++;
			while(si<ei && arr[ech]>1) {
				arr[s.charAt(si)]--;
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
//		System.out.println(ans);
		return ans;
	}

}
