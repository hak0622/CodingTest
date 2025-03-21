import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int[] arr = new int [num1];
        for(int i=0; i<arr.length; i++){
            int num2 = sc.nextInt();
            arr[i]=num2;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i])
                min=arr[i];
        }
        System.out.println(min+" "+max);
    }
}