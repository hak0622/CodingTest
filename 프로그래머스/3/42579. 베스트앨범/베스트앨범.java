import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalMap = new HashMap<>();
        Map<String, List<int[]>> musicMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            
            musicMap.putIfAbsent(genres[i], new ArrayList<>());
            musicMap.get(genres[i]).add(new int[]{i, plays[i]}); 
        }

        List<String> sortedGenres = new ArrayList<>(totalMap.keySet());
        sortedGenres.sort((g1, g2) -> totalMap.get(g2) - totalMap.get(g1));

        List<Integer> answerList = new ArrayList<>();
        
        for (String genre : sortedGenres) {
            List<int[]> songs = musicMap.get(genre);
            
            songs.sort((a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0]; 
                return b[1] - a[1]; 
            });

            answerList.add(songs.get(0)[0]); 
            if (songs.size() > 1) {
                answerList.add(songs.get(1)[0]);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}