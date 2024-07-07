package codingtest.programmers.basic.day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColatzSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        // [10, 5, 16, 8, 4, 2, 1]
    }

    public static int[] solution(int n) {

        List<Integer> answer = new ArrayList<>();

        answer.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
