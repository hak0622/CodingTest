class Solution {
    int[]parent;
    
    public int solution(int n, int[][] wires) {
        parent = new int[n+1];
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<wires.length; i++){
            for(int j=1; j<=n; j++){
                parent[j] = j;
            }
            
            for(int k=0; k<wires.length; k++){
                if(i == k) continue;
                
                int a = wires[k][0];
                int b = wires[k][1];
                
                union(a,b);
            }
            
            int count = 0;
            
            for(int z=1; z<=n; z++){
                if(find(1) == find(z)) count++;
            }
            
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer,diff);
        }
        
        return answer;
    }
    
    public void union(int a, int b){
        a = find(a);
        b = find(b);
        
        if(a != b) parent[b] = a;
    }
    
    public int find(int a){
        if(a == parent[a]) return a;
        
        return parent[a] = find(parent[a]);
    }
}