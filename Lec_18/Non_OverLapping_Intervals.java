package Lec_18;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Non_OverLapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1,2},{2,3},{1,3},{3,4}};
		System.out.println(eraseOverlapIntervals(arr));
	}

	public static int eraseOverlapIntervals(int[][] intervals) {
		PriorityQueue<interval> pq=new PriorityQueue<>(new Comparator<interval>() {

			@Override
			public int compare(interval o1, interval o2) {
				// TODO Auto-generated method stub
				return o1.ed-o2.ed;
			}
		});
		for(int[] arr:intervals) {
			pq.add(new interval(arr[0],arr[1]));
		}
		
		int c=1;
		int et=pq.peek().ed;
		while(!pq.isEmpty()) {
			interval i=pq.poll();
			if(i.st>=et) {
				c++;
				et=i.ed;
			}
		}
		return intervals.length-c;
	}

}

class interval{
	int st;
	int ed;
	
	interval(int s,int e){
		this.st=s;
		this.ed=e;
	}
}
