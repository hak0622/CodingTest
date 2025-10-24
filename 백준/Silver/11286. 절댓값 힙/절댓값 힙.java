import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            if(Math.abs(a) == Math.abs(b)){
                return a-b;
            }
            return Math.abs(a) - Math.abs(b);
        });

        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            if(x != 0){
                pq.add(x);
            }else{
                if(pq.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }
        }
    }
}