package Lec_17;

import java.util.Collections;
import java.util.PriorityQueue;

public class Furthest_Building_you_Can_reach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,2,7,6,9,14,12};
		int b=5;
		int l=1;
		System.out.println(furthestBuilding(arr,b,l));
	}	
	public static int furthestBuilding(int[] arr, int b, int l) {
        
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());   // max heap
		
		int i=0;
		while(i<arr.length-1) {
			int diff=arr[i+1]-arr[i];   // --> positive i+1 > i  --> negative  i+1<i  --> 0 i+1==i
//			System.out.println(i+" diff->"+diff+" l->"+l+" b->"+b);
			if(diff<=0) {
				i++;
			}
			else {
				if(b>=diff ) {
					// bricks are available so i will use brick and keep the track of bricks in heap
					b-=diff;
					i++;
					pq.add(diff);
				}
				else if(l>0){
					// ill go for ladders
					if(!pq.isEmpty() && pq.peek()>diff) {
						b+=pq.poll();
						l--;
					}
					else {
						l--;
						i++;
					}
				}
				else {
					break;
				}
			}
		}
		return i;
		
    }
	

}
