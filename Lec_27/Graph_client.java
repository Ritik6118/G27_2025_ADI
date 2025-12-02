package Lec_27;

public class Graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph(7);
		g.addEdge(1, 2, 2);
		g.addEdge(1, 3, 1);
		g.addEdge(2, 4, 2);
		g.addEdge(3, 4, 4);
		g.addEdge(4, 5, 2);
		g.addEdge(5, 7, 8);
		g.addEdge(5, 6, 2);
		g.addEdge(6, 7, 4);
//		g.bft();
//		g.dft();
//		System.out.println(g.hasPath_dfs(1,6)); 
//		System.out.println(g.hasPath_bfs(1,6)); 
//		g.display();
		g.dijkstra(1);
	}

}
