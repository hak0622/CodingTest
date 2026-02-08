class Solution {
    public String solution(int a, int b) {
        String[]days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] monthDays = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        
        for(int i=0; i<a-1; i++){
            sum = sum + monthDays[i];
        }
        sum = sum + (b-1);
        
        int start = 5;
        int dayIndex = (start + sum) % 7;
        return days[dayIndex];
    }
}