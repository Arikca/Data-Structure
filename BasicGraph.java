import java.util.*;

public class BasicGraph {
    int data;
    Map<Integer, LinkedList<Integer>> map;
    public BasicGraph(int vertex){
        map= new HashMap<Integer, LinkedList<Integer>>();
        for(int i=0;i<vertex;i++){
            map.put(i, new LinkedList<Integer>());
        }
    }
    public  void addEdge(int i, int j){
        map.get(i).add(j);
    }

    public int size(){
        int size=map.size();
        return size;
    }

    public void graphTraverse(BasicGraph g){
        int n=g.size();
        for(int i=0;i<n;i++){
            int m= map.get(i).size();
            for(int j=0;j<m;j++){
                System.out
                        .print(i+ " is connected to "+map.get(i).get(j)+" ");
                System.out.println();
            }

        }
    }

    //Depth first search

    public  void dfs(BasicGraph g,int i){
        //node to start with i
        boolean[] visited = new boolean[g.size()];
        Stack<Integer> stack= new Stack<>();
        stack.push(i);
        while(!stack.isEmpty()){
            int n= stack.peek();
            stack.pop();
            if(!visited[n]){
                visited[n] = true;
                System.out.print(n+ " ");
                int m=  map.get(n).size();
                for(int j=0;j<m;j++){
                    stack.push(map.get(n).get(j));
                }
            }
            
            
        }
        System.out.println();
    }

    public void bfs(BasicGraph g ,int i){
        boolean visited[] = new boolean[g.size()];
        Queue<Integer> queue= new LinkedList<>();
        queue.add(i);
        while(!queue.isEmpty()){
            int n= queue.peek();
            queue.poll();
            if(!visited[n]){
                visited[n]= true;
                System.out.print(n+" ");
                int m= map.get(n).size();
                for(int j=0;j< m;j++){
                    queue.add(map.get(n).get(j));
                }
            }
            
        }
        System.out.println();
    }

    public static void main(String[] args){
        BasicGraph graph = new BasicGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.graphTraverse(graph);
        graph.dfs(graph, 0);

        System.out.println("bfs");
        graph.bfs(graph, 0);
    }

}
