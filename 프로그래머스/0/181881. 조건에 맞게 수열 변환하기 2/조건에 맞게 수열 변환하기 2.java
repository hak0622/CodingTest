import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            int[]temp = new int[arr.length];
            
            for(int i=0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    temp[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){
                    temp[i] = arr[i] * 2 + 1;
                }else{
                    temp[i] = arr[i];
                }
            }
            
            if(Arrays.equals(arr,temp)){
                break;
            }
            arr = temp;
            answer++;
        }
        return answer;
    }
}