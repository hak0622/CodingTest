import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int max = 1;
        int count = 1;
        int[]num = new int[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            num[i] = strArr[i].length();
        }
        Arrays.sort(num);
        
        for(int i=1; i<num.length; i++){
            if(num[i] == num[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count>max) {
                max = count;
            }
        }
        return max;
    }
}