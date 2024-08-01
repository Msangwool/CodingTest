package codingtest.programmers.basic.day_5;

public class AddEqualOrderSequence {

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[] {true, false, false, true, true}));
        // 37
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }
        return answer;
    }

}
