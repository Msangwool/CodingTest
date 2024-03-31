package codingtest.programmers.basic.day_3;

public class ShakeString {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        // 내가 푼 풀이

        // 두 개의 String의 길이는 같음
        // length를 통해 반복
//        String answer = "";
//
//        for (int i = 0; i < str1.length(); i++) {
//            answer = answer + str1.charAt(i) + str2.charAt(i);
//        }

//        return answer;

        // 베스트 풀이 (StringBuilder 의 append()는 항상 문자열 연산이라는 것을 이용)
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }
}
