import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) list.add(x);

        for (int i = 0; i < query.length; i++) {
            int k = query[i];
            List<Integer> newList = new ArrayList<>();

            if (i % 2 == 0) {  
                for (int j = 0; j <= k && j < list.size(); j++) {
                    newList.add(list.get(j));
                }
            } else {  
                for (int j = k; j < list.size(); j++) {
                    newList.add(list.get(j));
                }
            }

            list = newList; 
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
