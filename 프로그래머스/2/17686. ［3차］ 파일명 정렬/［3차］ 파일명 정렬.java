import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a,b)->{
            int i=0;
            
            while(i<a.length() && !Character.isDigit(a.charAt(i))){
                i++;
            }
            
            String headA = a.substring(0,i).toLowerCase();
            
            int startA = i;
            
            while(i<a.length() && Character.isDigit(a.charAt(i)) && i-startA < 5){
                i++;
            }
            
            int numA = Integer.parseInt(a.substring(startA,i));
            
            int j=0;
            
            while(j<b.length() && !Character.isDigit(b.charAt(j))){
                j++;
            }
            
            String headB = b.substring(0,j).toLowerCase();
            
            int startB = j;
            
            while(j<b.length() && Character.isDigit(b.charAt(j)) && j-startB < 5){
                j++;
            }
            
            int numB = Integer.parseInt(b.substring(startB,j));
            
            int result = headA.compareTo(headB);
            
            if(result != 0) return result;
            
            return Integer.compare(numA, numB);
        });
        
        return files;
    }
}