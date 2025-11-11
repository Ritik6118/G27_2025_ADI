package Lec_05;

import java.util.Arrays;
import java.util.Scanner;

public class Rat_Chases_Its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char[][]arr=new char[r][];
		for(int i=0;i<r;i++) {
			String s=sc.next();
			arr[i]=s.toCharArray();
		}
		
		int [][] ans=new int [r][c];
		solve(arr,0,0,ans);
		if(flag==false) {
			System.out.println("NO PATH FOUND");
		}
		
	}
	
	static int [] r= {1,0,-1,0};
	static int [] c= {0,1,0,-1};
 	static boolean flag=false;
	
	private static void solve(char[][] arr, int row, int col, int[][] ans) {
		// TODO Auto-generated method stub
//		solve(arr,row+1,col+0,ans);   // v
//		solve(arr,row+0,col+1,ans);   // >
//		solve(arr,row-1,col+0,ans);   // ^ 
//		solve(arr,row+0,col-1,ans); // <
//		
		if(row<0 || col<0 ||row==arr.length || col==arr[0].length || arr[row][col]=='X' ||ans[row][col]==1) {
			return ;
		}
		if(row==arr.length-1 && col==arr[0].length-1) {
			ans[row][col]=1;
			for(int i=0;i<ans.length;i++) {
				for(int j=0;j<ans[0].length;j++) {
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
			ans[row][col]=0;
			flag=true;
			return;
		}
		
		
		for(int i=0;i<r.length;i++) {
			ans[row][col]=1;
			solve(arr,row+r[i],col+c[i],ans);
			ans[row][col]=0;
		}
	}

}
