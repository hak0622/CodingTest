import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 명령 개수
        sc.nextLine(); // 개행 제거

        Queue<Integer> q = new LinkedList<>();
        int last = -1; // back 값을 저장할 변수

        for (int i = 0; i < num; i++) {
            String[] input = sc.nextLine().split(" ");

            // 명령어 분기 처리
            if (input[0].equals("push")) {
                int value = Integer.parseInt(input[1]);
                q.offer(value);
                last = value; // 마지막으로 넣은 값 저장 (back 출력용)

            } else if (input[0].equals("pop")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.poll());
                }

            } else if (input[0].equals("size")) {
                System.out.println(q.size());

            } else if (input[0].equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);

            } else if (input[0].equals("front")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.peek());
                }

            } else if (input[0].equals("back")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(last);
                }
            }
        }
    }
}
