package Lec_27;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_oranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(arr));
	}

	public static int orangesRotting(int[][] arr) {
		Queue<pair> q=new LinkedList<pair>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==2) {
					q.add(new pair(i,j,0));
				}
			}
		}
		int[] r= {0,0,1,-1};
		int[] c= {1,-1,0,0};
		int time =0;
		while(!q.isEmpty()) {
			pair p=q.poll();
			for(int i=0;i<4;i++) {
				int nr=p.row+r[i];
				int nc=p.col+c[i];
				if(nr>=0 && nc>=0 && nr<arr.length && nc<arr[0].length && arr[nr][nc]==1) {
					arr[nr][nc]=2;
					q.add(new pair(nr,nc,p.time+1));
					time =p.time+1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1) {
					return -1;
				}
			}
		}
		return time;

		
		
	}

}
class pair{
	int row;
	int col;
	int time;
	
	pair(int r,int c,int t){
		row=r;
		col=c;
		time=t;
	}
}
