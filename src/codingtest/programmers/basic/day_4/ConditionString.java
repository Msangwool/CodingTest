package codingtest.programmers.basic.day_4;

public class ConditionString {

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        // 1
    }

    public static int solution(String ineq, String eq, int n, int m) {
        return (ineq.equals(">") ? n > m : n < m) || (eq.equals("=") ? n == m : false) ? 1 : 0;
    }

}
