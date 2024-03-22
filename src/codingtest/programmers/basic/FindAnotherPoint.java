package codingtest.programmers.basic;

import java.util.*;

public class FindAnotherPoint {
    public static void main(String[] args) {
        int[] solution = solution(new int[][]{{1, 4}, {3, 4}, {3, 10}});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[][] v) {
        Map<Long, Integer> x = new HashMap<>();
        Map<Long, Integer> y = new HashMap<>();

        for (int[] arr : v) {
            if (x.containsKey((long) arr[0])) {
                x.put((long) arr[0], x.get((long) arr[0]) + 1);
            } else {
                x.put((long) arr[0], 1);
            }

            if (y.containsKey((long) arr[1])) {
                y.put((long) arr[1], y.get((long) arr[1]) + 1);
            } else {
                y.put((long) arr[1], 1);
            }
        }
        int _x = 0;
        int _y = 0;
        for (int[] arr : v) {
            if (x.get((long) arr[0]) == 1) {
                _x = arr[0];
            }
            if (y.get((long) arr[1]) == 1) {
                _y = arr[1];
            }
        }

        return new int[]{_x, _y};
    }
}
