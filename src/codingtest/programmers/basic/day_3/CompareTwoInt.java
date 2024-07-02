package codingtest.programmers.basic.day_3;

public class CompareTwoInt {

    public static void main(String[] args) {
        System.out.println(solution(12, 3));
    }

    public static int solution(int a, int b) {

        // 여기서의 연산 +는 문자열 덧셈을 뜻함
        // a + b와 2 * a * b 중 더 큰값을 return -> max 하면 됨
        // a + b와 2 * a * b 는 어차피 같은 값이므로 둘 중 어떤 값을 반환하는지는 중요하지 않음
        return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
    }
}
