class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0; // 작은 쪽 중 최대
        int maxH = 0; // 큰 쪽 중 최대

        for (int[] size : sizes) {
            int w = Math.min(size[0], size[1]); // 작은 쪽
            int h = Math.max(size[0], size[1]); // 큰 쪽

            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }

        return maxW * maxH;
    }
}
