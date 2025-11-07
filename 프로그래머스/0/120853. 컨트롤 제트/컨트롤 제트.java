class Solution {
    public int solution(String s) {
        String[]arr = s.split(" ");
        int sum = 0;
        int last = 0;
        
        for(String str : arr){
            if(str.equals("Z")){
                sum -= last;
            }else{
                int num = Integer.parseInt(str);
                sum += num;
                last = num;
            }
        }
        return sum;
    }
}