package codingtest.programmers.basic.day_3;

public class ListToString {

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a", "b", "c"}));
    }

    public static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String str : arr) {
            answer.append(str);
        }
        return answer.toString();
    }
}
