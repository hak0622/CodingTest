import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[][] routes) {
        // 1. 진출 지점 기준으로 정렬하기 (Comparator 사용)
        Arrays.sort(routes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1]; // 진출 지점 기준 오름차순 정렬
            }
        });

        int cameraCount = 0; // 설치할 카메라 개수
        int cameraPosition = -30001; // 카메라 위치 초기화 (가능한 최소값보다 작게)

        // 2. 차량마다 확인하면서 카메라 설치
        for (int i = 0; i < routes.length; i++) {
            int start = routes[i][0]; // 차량 진입 지점
            int end = routes[i][1];   // 차량 진출 지점

            // 현재 차량이 이전 카메라에 안 걸리면, 새 카메라 설치
            if (start > cameraPosition) {
                cameraCount++;          // 카메라 하나 추가
                cameraPosition = end;   // 현재 차량의 진출 지점에 카메라 설치
            }
        }

        return cameraCount; // 최소 설치 카메라 수 반환
    }
}
