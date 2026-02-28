import java.util.*;

class Solution {
    List<String>list = new ArrayList<>();
    String[]vowels = {"A","E","I","O","U"};
    
    public int solution(String word) {
        generate("");
        Collections.sort(list);
        return list.indexOf(word) + 1;
    }
    
    public void generate(String cur){
        if(cur.length() > 5){
            return;
        }
        if(!cur.equals("")){
            list.add(cur);
        }
        for(String v : vowels){
            generate(cur + v);
        }
    }
}