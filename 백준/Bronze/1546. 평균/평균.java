import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //과목 개수

        int[]arr=new int[n];
        int max= Integer.MIN_VALUE; //최대값 변수 설정
        double sum = 0; //점수 합계
        double avg = 0; //과목 평균

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[i]=num;
            max=Math.max(max,num);
            sum+=num;
        }
        avg=sum/max*100/n;
        System.out.println(+avg);
    }
}
