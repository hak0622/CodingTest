import java.util.*;

class Solution {
    public int[] solution(String s) {
        String trimed = s.substring(2, s.length()-2);
        String[]arr = trimed.split("\\},\\{");
        
        Arrays.sort(arr, (o1,o2)->o1.length() - o2.length());
        
        List<Integer>list = new ArrayList<>();
        
        for(String s1 : arr){
            String[]numbers = s1.split(",");
            for(String str : numbers){
                int num = Integer.parseInt(str);
                if(!list.contains(num)) list.add(num);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}