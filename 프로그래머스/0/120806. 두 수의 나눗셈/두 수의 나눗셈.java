class Solution {
    public int solution(int num1, int num2) {
        double answer=0;
        double result1 = (double)num1/num2;
        // System.out.println(result1);
        answer = result1*1000;
        return (int)answer;
    }
}