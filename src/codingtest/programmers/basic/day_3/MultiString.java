package codingtest.programmers.basic.day_3;

public class MultiString {

    public static void main(String[] args) {
        System.out.println(solution("string", 3));
    }

    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
