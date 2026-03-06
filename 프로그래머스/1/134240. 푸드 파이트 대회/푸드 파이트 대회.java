class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            if(i % 2 != 0){
                int n1 = food[i] / 2;
                
                for(int j=0; j<n1; j++){
                    sb.append(i);
                }
            }else{
                int n2 = food[i] / 2;
                
                for(int k=0; k<n2; k++){
                    sb.append(i);
                }
            }
        }
        
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        
        return s1 + "0" + s2;
    }
}