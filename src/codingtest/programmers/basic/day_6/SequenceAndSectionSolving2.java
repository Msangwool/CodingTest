package codingtest.programmers.basic.day_6;

import java.util.Arrays;

public class SequenceAndSectionSolving2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
        // [3, 4, -1]
    }

    public static int[] solution(int[] arr, int[][] queries) {
        // 한 행이 하나의 동작 단위
        // s <= i <= e인데, k보다 커야돼
        // s <= i
        // k < i
        // i <= e
        // 위 조건을 만족하면서 가장 작은 숫자를 넣음
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            boolean isIt = false;
            for (int j = s; j <= e; j++) {
                if (k < arr[j] && arr[j] < min) {
                    min = arr[j];
                    isIt = true;
                }
            }

            if (isIt) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
