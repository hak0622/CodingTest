class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[]arr = new String[2];
        if(binomial.contains("+")){
            arr = binomial.split("\\+");
            int a = Integer.parseInt(arr[0].trim());
            int b = Integer.parseInt(arr[1].trim());
            answer = a + b; 
        }else if(binomial.contains("-")){
            arr = binomial.split("\\-");
            int a = Integer.parseInt(arr[0].trim());
            int b = Integer.parseInt(arr[1].trim());
            answer = a - b; 
        }else if(binomial.contains("*")){
            arr = binomial.split("\\*");
            int a = Integer.parseInt(arr[0].trim());
            int b = Integer.parseInt(arr[1].trim());
            answer = a * b; 
        }
        return answer;
    }
}