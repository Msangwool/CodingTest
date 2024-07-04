package codingtest.programmers.basic.day_5;

public class ElementsSumAndMulti {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        // 1
    }

    public static int solution(int[] num_list) {
        int result1 = 1;
        int result2 = 0;

        for (int j : num_list) {
            result1 *= j;
            result2 += j;
        }

        return result1 < result2*result2 ? 1 : 0;
    }

}
