class Solution {
    int[]parent;
    
    public int solution(int n, int[][] computers) {
        parent = new int[n];
        int answer = 0;
        
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(computers[i][j] == 1){
                    union(i,j);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(find(i) == i) answer++;
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