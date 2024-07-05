package codingtest.programmers.basic.day_5;

public class DiceGame2 {

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
        // 473
    }

    public static int solution(int a, int b, int c) {

        int answer = a + b + c;
        if (a == b && a == c) {
            answer *= (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a == b || b == c || a == c) {
            answer *= (a*a + b*b + c*c);
        }

        return answer;
    }

}
