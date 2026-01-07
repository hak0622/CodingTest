class Solution {
    public int[] solution(int N, int[] stages) {
        int[]count = new int[N+2];
        for(int i=0; i<stages.length; i++){
            count[stages[i]]++;
        }
        
        double[]fail = new double[N];
        int users = stages.length;
        
        for(int i=0; i<N; i++){
            fail[i] = (double)count[i+1] / users;
            users = users - count[i+1];
        }
        
        int[]stage = new int[N];
        for(int i=0; i<N; i++){
            stage[i] = i+1;
        }
        
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-i-1; j++){
                if(fail[j] < fail[j+1]){
                    double tempFail = fail[j];
                    fail[j] = fail[j+1];
                    fail[j+1] = tempFail;
                    
                    int tempStage = stage[j];
                    stage[j] = stage[j+1];
                    stage[j+1] = tempStage;
                }
            }
        }
        
        return stage;
    }
}