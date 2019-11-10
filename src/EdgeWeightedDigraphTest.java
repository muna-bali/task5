public class EdgeWeightedDigraphTest {

    public static void main(String[] args){

        int V = 8;

        EdgeWeightedDigraph g = new EdgeWeightedDigraph(V);

        g.addEdge(0,1,5.0);
        g.addEdge(0,4,9.0);
        g.addEdge(0,7,8.0);
        g.addEdge(1,2,12.0);
        g.addEdge(1,3,15.0);
        g.addEdge(1,7,4.0);
        g.addEdge(2,3,3.0);
        g.addEdge(2,6,11.0);
        g.addEdge(3,6,9.0);
        g.addEdge(4,5,4.0);
        g.addEdge(4,6,20.0);
        g.addEdge(4,7,5.0);
        g.addEdge(5,2,1.0);
        g.addEdge(5,6,13.0);
        g.addEdge(7,5,6.0);
        g.addEdge(7,2,7.0);


        // print adjacents
        for(int i=0; i<V; i++){
            String str = "[ ";
            for(DirectedEdge e: g.adj(i))
                str = str + e.to() + " ";
            str = str + "]";
            System.out.println("adj of " + i + " is: " + str);
        }


        // run Dijkstra
        Dijkstra dijkstra = new Dijkstra(g,0);
        for(int i=0; i<V; i++)
            System.out.println("distance from vertix 0 to vertic " + i + " is " + dijkstra.distTo(i));

    }

}
