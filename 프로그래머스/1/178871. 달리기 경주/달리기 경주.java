import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer>pos = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            pos.put(players[i],i);
        }
        
        for(String name : callings){
            int idx = pos.get(name);
            int front = idx - 1;
            
            String temp = players[idx];
            players[idx] = players[front];
            players[front] = temp;
            
            pos.put(players[idx],idx);
            pos.put(players[front],front);
        }
        return players;
    }
}