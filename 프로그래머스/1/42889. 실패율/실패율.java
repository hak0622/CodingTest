class Solution {
    public int[] solution(int N, int[] stages) {
        int[]arr = new int[N+2];
        double[]fail = new double[N+1];
        int total = stages.length;
        
        for(int i=0; i<stages.length; i++){
            arr[stages[i]]++;
        }

        for(int i=1; i<=N; i++){
            if(total == 0){
                fail[i] = 0;
            }else{
                fail[i] = (double) arr[i] / total;
            }
            
            total = total - arr[i];
        }
        
        int[]answer = new int[N];
        
        for(int i=0; i<N; i++){
            answer[i] = i+1;
        }
        
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(fail[answer[i]] < fail[answer[j]]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
                else if(fail[answer[i]] == fail[answer[j]] && answer[i] > answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}