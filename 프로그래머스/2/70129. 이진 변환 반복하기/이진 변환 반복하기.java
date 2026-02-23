class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;
        
        String str = s;
        
        while(!str.equals("1")){
            count++;
            
            int beforeLength = str.length();
            str = str.replace("0","");
            
            int afterLength = str.length();
            zero = zero + (beforeLength - afterLength);
            
            str = Integer.toBinaryString(afterLength);
        }
        return new int[]{count,zero};
    }
}