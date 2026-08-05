class Solution {
    Set<Integer> bug = new HashSet<>();
    public void dfs(HashMap<Integer,List<Integer>> graph,Set<Integer> visited,int k){
            Stack<Integer> s = new Stack<>();
            s.push(k);
           
            while(!s.isEmpty()){
                int currentNode = s.pop();
                if(!visited.contains(currentNode)){
                    visited.add(currentNode);
                     bug.add(currentNode);

                    List<Integer> neighbors = graph.getOrDefault(currentNode,new ArrayList<>());
                    for(int i=0;i<neighbors.size();i++){
                         int neighbor = neighbors.get(i);
                       if(!visited.contains(neighbor)){
    
                            s.push(neighbor);
                        }
                    }
                }

            }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
            HashMap<Integer,List<Integer>> graph = new HashMap<>();
            for(int i=0;i<n;i++){
                    List<Integer> t = new ArrayList<>();
                    graph.put(i,t);
            }

            for(int i=0;i<invocations.length;i++){
                    int key = invocations[i][0];
                  List<Integer> l =graph.get(key);
                  l.add(invocations[i][1]);
                  graph.put(key,l);
            }
       
            Set<Integer> visited = new HashSet<>();
            dfs(graph,visited,k);
            if(visited.size()==n)
                return new ArrayList<>();
           
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(bug.contains(i))
                  continue;
                List<Integer> neighbors = graph.getOrDefault(i,new ArrayList<>());
                boolean touch = false;
                for(int j=0;j<neighbors.size();j++){
                        if(bug.contains(neighbors.get(j))){
                            touch=true;
                            break;
                        }
                }
                if(touch){
                    List<Integer> result1 = new ArrayList<>();
                     for(int x=0;x<n;x++)
                         result1.add(x);
                        return result1;
        
                }
                else{
                    result.add(i);
                }

            }
            
      
            return result;

    }
}