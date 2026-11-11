class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[]arr = new String[skill_trees.length];
        
        for(int i=0; i<skill_trees.length; i++){
            StringBuilder sb = new StringBuilder();
            
            for(int j=0; j<skill_trees[i].length(); j++){
                char c = skill_trees[i].charAt(j);
                
                if(skill.contains(String.valueOf(c))){
                    sb.append(c);
                }
            }
            arr[i] = sb.toString();
        }
        
        for(int i=0; i<arr.length; i++){
            int idx = 0;
            boolean check = true;
            
            for(int j=0; j<arr[i].length(); j++){
                char c = arr[i].charAt(j);
                
                if(skill.charAt(idx) != c) {
                    check = false;
                    break;
                }
                idx++;
            }
            
            if(check) answer++;
        }
        return answer;
    }
}