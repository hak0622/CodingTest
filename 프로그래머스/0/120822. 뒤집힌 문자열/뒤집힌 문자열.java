import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        char[]arr = new char[my_string.length()];
        char[]reverse = new char[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        for(int j=arr.length-1,k=0; j>=0; j--,k++){
           reverse[k]=arr[j];
        }
        
        return new String(reverse);
    }
}