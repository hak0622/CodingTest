import java.util.*;

class Solution {
    class Word{
        String word;
        int count;
        Word(String word,int count){
            this.word=word;
            this.count=count;
        }
    }
    int getDiffCount(String word1,String word2){
        int count=0;
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i)!=(word2.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public int solution(String begin, String target, String[] words) {
        Set<String>visited = new HashSet<>();
        Queue<Word> q = new LinkedList<>();
        q.offer(new Word(begin,0));
        visited.add(begin);
        
        while(!q.isEmpty()){
            Word current = q.poll();
            if(current.word.equals(target)){
                return current.count;
            }
            for(String next:words){
                if(getDiffCount(current.word,next)==1){
                    if(!visited.contains(next)){
                        q.offer(new Word(next,current.count+1));
                        visited.add(next);
                    }
                }
            }
        }
        return 0;
    }
}