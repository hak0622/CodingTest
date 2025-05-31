import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 수
        Map<String, Integer> total = new HashMap<>();

        // 장르별 우선순위 큐 (play 수 내림차순, 동점이면 인덱스 오름차순)
        Map<String, PriorityQueue<int[]>> song = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            total.put(genre, total.getOrDefault(genre, 0) + play);

            // 우선순위 큐 초기화
            song.putIfAbsent(genre, new PriorityQueue<>((a, b) -> {
                if (b[1] == a[1]) return a[0] - b[0]; // 재생수 같으면 인덱스 작은 게 먼저
                return b[1] - a[1]; // 재생수 내림차순
            }));

            song.get(genre).add(new int[]{i, play});
        }

        // 장르 재생수 내림차순 정렬
        List<String> sortGenre = new ArrayList<>(total.keySet());
        sortGenre.sort((g1, g2) -> total.get(g2) - total.get(g1));

        List<Integer> answerList = new ArrayList<>();

        for (String genre : sortGenre) {
            PriorityQueue<int[]> pq = song.get(genre);
            answerList.add(pq.poll()[0]); // 가장 많이 재생된 노래

            if (!pq.isEmpty()) {
                answerList.add(pq.poll()[0]); // 두 번째로 많이 재생된 노래 (있으면)
            }
        }

        // List -> 배열 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
