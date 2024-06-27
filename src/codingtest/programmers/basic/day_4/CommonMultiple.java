package codingtest.programmers.basic.day_4;

public class CommonMultiple {

    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
        // 1
    }

    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

}
