class Solution {
    boolean solution(String s) {
        String upperS = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        if(!upperS.contains("P") && !upperS.contains("Y")){
            return true;
        }
        
        for(int i=0; i<upperS.length(); i++){
            if(upperS.charAt(i) == 'P'){
                p++;
            }else if(upperS.charAt(i) == 'Y'){
                y++;
            }
        }
        
        return p == y ? true : false;
    }
}