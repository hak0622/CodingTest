import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i< input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int count=0;

        // arr = [1, 1, 1, 1]
        for(int i=0; i < N; i++) {
            int sum=0;
            for(int j=i; j < N; j++){
                sum=sum+arr[j];
                if(sum==M){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
