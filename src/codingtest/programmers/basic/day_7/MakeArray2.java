package codingtest.programmers.basic.day_7;

import java.util.*;

public class MakeArray2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        // [5, 50, 55, 500, 505, 550, 555]
        System.out.println(Arrays.toString(solution(10, 20)));
        // [-1]
    }

    public static int[] solution(int l, int r) {

        List<Integer> answer = new ArrayList<>();

        boolean isIt = false;
        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                String str = String.valueOf(i);
                boolean isOk = true;
                for (int j = 0; j < str.length(); j++) {
                    if (!(str.charAt(j) == '0' || str.charAt(j) == '5')) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    answer.add(Integer.parseInt(str));
                    isIt = true;
                }
            }
        }

        if (!isIt) {
            return new int[] {-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
