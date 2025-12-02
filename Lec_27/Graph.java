package Lec_27;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	HashMap<Integer,HashMap<Integer,Integer>> map;
	
	Graph(){
		map=new HashMap<>();
	}
	Graph(int n){
		map=new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(i,new HashMap<>());
		}
	}
	public void addVertex(int v) {
		map.put(v,new HashMap<>());
	}
	
	public void addEdge(int v1, int v2, int wt) {
		map.get(v1).put(v2, wt);
//		map.get(v2).put(v1, wt);
	}
	
	public void removeVertex(int v) {
		for(int i:map.get(v).keySet()) {
			map.get(i).remove(v);     // removing entry of v from its neighbours
		}
		map.remove(v);
	}
	
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
//		map.get(v2).remove(v1);
	}
	
	public void updateEdge(int v1,int v2,int wt) {
		this.addEdge(v1, v2, wt);
	}
	
	HashSet<Integer> vis=new HashSet<>();
	public boolean hasPath_dfs(int src,int des) {
		if(src==des) {
			return true;
		}
		if(vis.contains(src)) {
			return false;
		}
		vis.add(src);
		for(int nbrs:map.get(src).keySet()) {
			
			if(hasPath_dfs(nbrs,des)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean hasPath_bfs(int src,int des) {
		HashSet<Integer> vis=new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int n=q.poll();
			if(vis.contains(n)) {
				continue;
			}
			vis.add(n);
			if(n==des) {
				return true;
			}
			for(int i:map.get(n).keySet()) {
				q.add(i);
			}
		}
		return false;
	}
	public void bft() {
		// loop on all vtx
		HashSet<Integer> vis=new HashSet<>();
		for(int i:map.keySet()) {
			System.out.println();
			if(vis.contains(i)==false) {  // bfs for i
				Queue<Integer> q=new LinkedList<>();
				q.add(i);
				
				while(!q.isEmpty()) {
					int n=q.poll();
					if(vis.contains(n)) {
						continue;
					}
					System.out.print(n);
					vis.add(n);
					for(int nn:map.get(n).keySet()) {
						q.add(nn);
					}
				}
			}
		}
	}
	
	public void dft() {
		HashSet<Integer> vis=new HashSet<>();
		for(int i:map.keySet()) {
			System.out.println();
			if(vis.contains(i)==false) {  // bfs for i
				Stack<Integer> q=new Stack<>();
				q.add(i);
				
				while(!q.isEmpty()) {
					int n=q.pop();
					if(vis.contains(n)) {
						continue;
					}
					System.out.print(n);
					vis.add(n);
					for(int nn:map.get(n).keySet()) {
						q.add(nn);
					}
				}
			}
		}
	}
	public void display() {
		System.out.println(map);
	}
	public void dijkstra(int src) {
		// TODO Auto-generated method stub
		HashSet<Integer> vis=new HashSet<>();
		PriorityQueue<dpair> pq=new PriorityQueue<>(new Comparator<dpair>() {

			@Override
			public int compare(dpair o1, dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		pq.add(new dpair(src,"",0));
		
		while(!pq.isEmpty()) {
			dpair p=pq.poll();
			if(vis.contains(p.vtx)) {
				continue;
			}
			System.out.println(p);
			vis.add(p.vtx);
			
			for(int i:map.get(p.vtx).keySet()) {
				pq.add(new dpair(i,p.path+"->"+p.vtx,p.cost+map.get(p.vtx).get(i)));
			}
			
			
		}
	}
}

class dpair{
	int vtx;
	String path;
	int cost;
	
	dpair(int v,String p,int c){
		this.vtx=v;
		this.path=p;
		this.cost=c;
	}
	public String toString() {
		return vtx+" via path "+path +" @ cost "+cost;
	}
}