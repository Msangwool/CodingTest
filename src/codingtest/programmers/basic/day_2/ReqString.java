package codingtest.programmers.basic.day_2;

import java.util.Scanner;

public class ReqString {
    public static void main(String[] args) {
        // input
        // abcde
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i)).append("\n");
        }
        System.out.println(sb);
        // output
        // a
        // b
        // c
        // d
        // e
    }
}
