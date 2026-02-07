import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            int merged = arr1[i] | arr2[i];
            String bin = Integer.toBinaryString(merged);
            
            while(bin.length() < n){
                bin = "0" + bin;
            }
            
            bin = bin.replace('1','#').replace('0',' ');
            answer[i] = bin;
        }
        return answer;
    }
}