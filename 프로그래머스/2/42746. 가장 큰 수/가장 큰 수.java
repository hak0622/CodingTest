import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[]arr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = numbers[i] + "";
        }
        
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        
        if(arr[0].equals("0")) return "0";
        
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}