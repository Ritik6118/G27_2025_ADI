package Lec_26;

import java.util.LinkedList;
import java.util.Queue;

public class Num_Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numIslands(char[][] arr) {
		int c=0;
		boolean [][] vis=new boolean [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]=='1' && vis[i][j]==false) {
					bfs(arr,vis,i,j);
					c++;
				}
			}
		}
		return c;
	}
	
	int [] row= {1,-1,0,0};
	int [] col= {0,0,-1,1};
	
	private void bfs(char[][] arr, boolean[][] vis, int r, int c) {
		// TODO Auto-generated method stub
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(r,c));
		while(!q.isEmpty()) {
			Pair p=q.poll();
			if(vis[p.r][p.c]==true) {
				continue;
			}
			vis[p.r][p.c]=true;
			for(int i=0;i<4;i++) {
				int nr=p.r+row[i];
				int nc=p.c+col[i];
				
				if(nr>=0 && nc>=0 && nr<arr.length && nc<arr[0].length && arr[nr][nc]=='1') {
					q.add(new Pair(nr,nc));
				}
			}

		}
	}

}
class Pair{
	int r;
	int c;
	
	Pair(int r,int c){
		this.r=r;
		this.c=c;
	}
}
