package codingtest.programmers.basic.day_6;

import java.util.Arrays;

public class SequenceAndSectionSolving3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 3}, {1, 2}, {1, 4}})));
        // [3, 4, 1, 0, 2]
    }

    public static int[] solution(int[] arr, int[][] queries) {
        // 한 행이 쿼리를 나타냄
        // 한 행의 열별로 좌표 위치를 변경

        // 행만큼 반복
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
