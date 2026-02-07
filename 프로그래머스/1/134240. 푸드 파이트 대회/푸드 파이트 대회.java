class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int count = food[i] / 2;
            
            for(int j=0; j<count; j++){
                sb.append(i);
            }
        }
        String left = sb.toString();
        
        sb.append('0');
        sb.append(new StringBuilder(left).reverse());
        
        return sb.toString();
    }
}