import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer>queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        System.out.print("<");
        while(!queue.isEmpty()){
            for(int i=0; i<k-1; i++){
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll());
            if(!queue.isEmpty()){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
