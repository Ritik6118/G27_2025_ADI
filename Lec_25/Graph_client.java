package Lec_25;

public class Graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph(7);
		g.addEdge(1, 2, 1);
		g.addEdge(1, 4, 2);
		g.addEdge(2, 3, 4);
		g.addEdge(4, 3, 2);
//		g.addEdge(3, 5, 3);
		g.addEdge(5, 7, 9);
		g.addEdge(5, 6, 1);
		g.addEdge(7, 6, 4);
//		g.bft();
		g.dft();
//		System.out.println(g.hasPath_dfs(1,6)); 
//		System.out.println(g.hasPath_bfs(1,6)); 
//		g.display();
	}

}
