import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {        
        int people = stages.length;
        int[]peoples = new int[N+1];
        double[]success = new double[N+1];
        Integer[]order = new Integer[N];
        
        for(int i=0; i<stages.length; i++){
            if(stages[i] > N) continue;
            else peoples[stages[i]]++;
        }
        
        for(int i=1; i<peoples.length; i++){
            if(people == 0) success[i] = 0;
            else success[i] = (double)peoples[i] / people;
        
            people = people - peoples[i];
        }
        
        for(int i=0; i<N; i++){
            order[i] = i+1;
        }
        
        Arrays.sort(order,(a,b)->{
            if(success[a] == success[b]) return a - b;
            return Double.compare(success[b], success[a]);
        });
        
       return Arrays.stream(order).mapToInt(i -> i).toArray();
    }
}