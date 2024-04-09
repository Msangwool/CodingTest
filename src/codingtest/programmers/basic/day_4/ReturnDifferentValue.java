package codingtest.programmers.basic.day_4;

public class ReturnDifferentValue {

    public static void main(String[] args) {
        System.out.println(solution(10));
        // 220
    }

    public static int solution(int n) {

        return n % 2 == 0 ? sumEven(n) : sumOdd(n);
    }

    public static int sumOdd(int oddNum) {
        int sum = 0;
        for (int i = 1; i <= oddNum; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumEven(int evenNum) {
        int sum = 0;
        for (int i = 2; i <= evenNum; i += 2) {
            sum += i * i;
        }
        return sum;
    }

}
