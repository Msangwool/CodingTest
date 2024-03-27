package codingtest.programmers.basic.day_2;

public class StringOverlay {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        // 1번 구간 더하기
        sb.append(my_string.substring(0, s));
        // 2번 구간 중간에 끼워넣기
        sb.append(overwrite_string);
        // 3번 구간 만약 남은 길이가 있음 붙이기
        if (s + overwrite_string.length() < my_string.length()) {
            sb.append(my_string.substring(s + overwrite_string.length(), my_string.length()));
        }
        return sb.toString();
    }
}
