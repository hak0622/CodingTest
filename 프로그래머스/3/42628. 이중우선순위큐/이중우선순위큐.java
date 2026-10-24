import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer>minPQ = new PriorityQueue<>();
        PriorityQueue<Integer>maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<operations.length; i++){
            String[]s = operations[i].split(" ");
            
            if(s[0].equals("I")){
                minPQ.add(Integer.parseInt(s[1]));
                maxPQ.add(Integer.parseInt(s[1]));
            }else{
                if(s[1].equals("1")){
                    if(!maxPQ.isEmpty()){
                        int maxQ = maxPQ.poll();
                        minPQ.remove(maxQ);
                    }
                }else{
                    if(!minPQ.isEmpty()){
                        int minQ = minPQ.poll();
                        maxPQ.remove(minQ);
                    }
                }
            }
        }
        
        int max = 0;
        int min = 0;
        
        if(minPQ.isEmpty() && maxPQ.isEmpty()){
            return new int[]{0,0};
        }else{
            max = maxPQ.poll();
            min = minPQ.poll();
        }
        
        return new int[]{max,min};
    }
}