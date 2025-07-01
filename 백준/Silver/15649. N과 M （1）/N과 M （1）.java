import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int a,b;
    static boolean[]visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        visited = new boolean[a+1];

        back(new ArrayList<Integer>(),1);
    }
    public static void back(List<Integer>list, int length){
        if(length == b+1){
            for(Integer i : list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=a; i++) {
            if (visited[i] == true) {
                continue;
            }
            visited[i] = true;
            list.add(i);
            back(list, length + 1);
            visited[i] = false;
            list.remove(list.indexOf(i));
        }
    }
}
