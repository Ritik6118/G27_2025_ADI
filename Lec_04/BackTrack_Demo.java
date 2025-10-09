package Lec_04;

import java.util.ArrayList;

public class BackTrack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li =new ArrayList<>();
		Long digit=0l;
		
//		System.out.println(li);
		fun(li,9,digit);
		
		
//		fun(li,20);
		System.out.println(li);
		System.out.println(digit);
	}

	private static void fun(ArrayList<Integer> li, int n,long digit) {
		// TODO Auto-generated method stub
		if(n==0) {
//			System.out.println(li);
//			System.out.println(digit);
			return;
		}
		li.add(n);
		fun(li,n-1,(digit*10)+n);
		li.remove(li.size()-1);
	}

}
