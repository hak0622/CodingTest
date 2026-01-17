class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 왼손, 오른손 시작 위치
        int leftX = 3, leftY = 0;   // *
        int rightX = 3, rightY = 2; // #

        for (int num : numbers) {
            int x = 0, y = 0;

            // 숫자의 좌표 구하기
            if (num == 0) {
                x = 3; y = 1;
            } else {
                x = (num - 1) / 3;
                y = (num - 1) % 3;
            }

            // 왼쪽 열 → 무조건 왼손
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftX = x;
                leftY = y;
            }
            // 오른쪽 열 → 무조건 오른손
            else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightX = x;
                rightY = y;
            }
            // 가운데 열 → 거리 계산
            else {
                int leftDist = Math.abs(leftX - x) + Math.abs(leftY - y);
                int rightDist = Math.abs(rightX - x) + Math.abs(rightY - y);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftX = x;
                    leftY = y;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    rightX = x;
                    rightY = y;
                } else {
                    // 거리 같으면 손잡이 기준
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightX = x;
                        rightY = y;
                    } else {
                        answer.append("L");
                        leftX = x;
                        leftY = y;
                    }
                }
            }
        }

        return answer.toString();
    }
}
