import java.util.*;

class Solution {
    public int solution(String[] words) {
        int answer = 0;
        Arrays.sort(words);
        int[]counts = new int[words.length];
        
        for(int i=0; i<words.length-1; i++){
            String pre = words[i];
            String next = words[i+1];
            int len = Math.min(pre.length(),next.length());
            int sameCount = sameCount(pre,next,len);
            
            //// len과 sameCount 같은 경우 긴 문자가 짧은 문자를 prefix로 포함하고 있다는 의미
            if(sameCount == len){
                counts[i] = Math.max(counts[i],sameCount);
            }else{
                counts[i] = Math.max(counts[i],sameCount+1);
            }
            counts[i+1] = Math.max(counts[i+1],sameCount+1);
        }
        for(int count : counts){
            answer += count;
        }
        return answer;
    }
    static int sameCount(String pre,String next,int len){
        int count = 0;
        for(int j=0; j<len; j++){
            if(pre.charAt(j)!=next.charAt(j)){
                return count;
            }
            count++;
        }
        return count;
    }
}