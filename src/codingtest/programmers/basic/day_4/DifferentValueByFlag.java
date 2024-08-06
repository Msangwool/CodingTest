package codingtest.programmers.basic.day_4;

public class DifferentValueByFlag {

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        // 3
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }

}
