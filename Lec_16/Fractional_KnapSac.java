package Lec_16;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Fractional_KnapSac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] val= {60,100,120};
		int [] wt={10,20,30};
		int cap=50;
		System.out.println(solve(val,wt,cap));
	}

	private static double solve(int[] val, int[] wt, int cap) {
		// TODO Auto-generated method stub
		
		PriorityQueue<item> pq=new PriorityQueue<>(new Comparator<item>() {

			@Override
			public int compare(item o1, item o2) {
				// TODO Auto-generated method stub
				double v1=o1.val/o1.wt;
				double v2=o2.val/o2.wt;
				
//				return v2-v1;   --> descending
//				return v1-v2;    --> ascending
				if(v1<v2) {
					return 1;
				}
				else if(v1==v2) {
					return 0;
				}
				else {
					return -1;
				}
			}
		});  
		// to sort items in descending order acc to value per unit weight
		
		
		for(int i=0;i<val.length;i++) {
			pq.add(new item(val[i],wt[i]));
		}
		
		double ans=0;
		
		while(!pq.isEmpty()) {
			item i=pq.poll();
			if(cap>i.wt) {
				cap-=i.wt;
				ans+=i.val;
			}
			else {
				double v=i.val/i.wt;
				ans+=cap*v;
				break;
			}
		}
		
		return ans;
	}

}

class item{
	int val;
	int wt;
	
	item(int v,int w){
		this.val=v;
		this.wt=w;
	}
	
	item(){}
}
