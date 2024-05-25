class Solution {
    
    public static void dfs(int[][] graph, int u, int target,List<Integer> temp, List<List<Integer>> result ){
        
        temp.add(u);
        
        if(u==target){
            result.add(new ArrayList<>(temp));
            
        }
        else{
            for(int v : graph[u]){
                dfs(graph, v, target, temp, result);
            }
        }
        temp.remove(temp.size()-1);
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int n = graph.length;
        int source = 0;
        int target = n-1;
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(graph, source, target, temp, result);
        
        return result;
        
        
        
        
    }
}