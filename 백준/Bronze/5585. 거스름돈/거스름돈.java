import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //380원
        int result=0;

        int[] arr = new int[]{500,100,50,10,5,1};
        int money = 1000-num;
        for(int i=0; i<arr.length; i++){
            result += money / arr[i];
            money = money % arr[i];
        }
        System.out.println(result);
    }
}
