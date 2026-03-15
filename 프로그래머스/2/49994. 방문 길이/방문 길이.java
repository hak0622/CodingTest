import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String>visit = new HashSet<>();
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            
            int prevX = x;
            int prevY = y;
            
            if(c == 'U' && y < 5) y++;
            else if(c == 'D' && y > -5) y--;
            else if(c == 'R' && x < 5) x++;
            else if(c == 'L' && x > -5) x--;
            else continue;
            
            String path1 = prevX + "" + prevY + "" + x + "" + y;
            String path2 = x + "" + y + "" + prevX + "" + prevY;
            
            visit.add(path1);
            visit.add(path2);
        }
        return visit.size() / 2;
    }
}