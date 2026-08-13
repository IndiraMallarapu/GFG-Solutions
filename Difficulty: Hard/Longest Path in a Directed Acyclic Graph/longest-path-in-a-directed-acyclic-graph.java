class Solution {
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        // code here
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MIN_VALUE);
        dist[src]=0;
        for(int i=0;i<V;i++){
            for(ArrayList<Integer>edge : edges){
                int u=edge.get(0);
                int v=edge.get(1);
                int w=edge.get(2);
                if(dist[v]<dist[u]+w && dist[u]!=Integer.MIN_VALUE)
                    dist[v]=dist[u]+w;
            }
        }
        return dist;
    }
}
