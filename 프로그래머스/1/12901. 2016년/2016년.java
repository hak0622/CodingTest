class Solution {
    public String solution(int a, int b) {
        String[]days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] monthDays = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        
        int sumDays = 0;
        
        for(int i=0; i<a-1; i++){
            sumDays = sumDays + monthDays[i];
        }
        
        sumDays = sumDays + (b-1);
        
        int startDay = 5;
        int dayIndex = (startDay + sumDays) % 7;
        
        return days[dayIndex];
    }
}