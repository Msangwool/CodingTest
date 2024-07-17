package codingtest.programmers.basic.day_7;

import java.util.Arrays;

public class CountUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
        // [3, 4, 5, 6, 7, 8, 9, 10]
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}
