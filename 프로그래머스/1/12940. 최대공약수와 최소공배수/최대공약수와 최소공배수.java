class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int A = n;
        int B = m;
        while(B != 0){
            int temp = A % B;
            A = B;
            B = temp;
        }
        answer[0] = A;
        answer[1] = (n * m) / A;
        return answer;
    }
}