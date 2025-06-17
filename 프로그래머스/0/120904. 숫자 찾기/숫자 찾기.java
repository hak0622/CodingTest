class Solution {
    public int solution(int num, int k) {
        String s = ""+num;
        String target = ""+k;
        int idx = s.indexOf(target);
        System.out.println("idx :" + idx);
        return (idx == -1) ? -1 : idx + 1;
    }
}