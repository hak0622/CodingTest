import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[]arr= new int[num];
        int sum=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<=i; j++){
               sum+=arr[j];
           }
       }
        System.out.println(sum);
    }
}
