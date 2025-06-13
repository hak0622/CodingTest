class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String ab = a1+b1;
        System.out.println(ab);
        int a2 = Integer.parseInt(ab);
        int ab2 = 2 * a * b;
        System.out.println(a2+" "+ab2);
        
        if(a2>ab2){
            return a2;
        }else if(a2<ab2){
            return ab2;
        }else{
            return a2;
        }
        // return answer;
    }
}