import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer>map1 = new HashMap<>();
        HashMap<String,List<int[]>>map2 = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            map1.put(genres[i], map1.getOrDefault(genres[i],0) + plays[i]);
        }
        List<String>list1 = new ArrayList<>(map1.keySet());
        list1.sort((a,b) -> map1.get(b) - map1.get(a));
        
        for(int i=0; i<genres.length; i++){
            if(!map2.containsKey(genres[i])) {
                map2.put(genres[i], new ArrayList<>());
            }
            map2.get(genres[i]).add(new int[]{i, plays[i]});
        }
        
        List<Integer>answer = new ArrayList<>();
        
        for(String genre : list1){
            List<int[]>songs = map2.get(genre);
            
            songs.sort((a,b) -> {
                if(a[1] == b[1]) return a[0] - b[0];
                return b[1] - a[1];
            });
            
            answer.add(songs.get(0)[0]);
            
            if(songs.size() > 1) answer.add(songs.get(1)[0]);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}