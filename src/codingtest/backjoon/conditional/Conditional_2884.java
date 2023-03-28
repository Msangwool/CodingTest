package codingtest.backjoon.conditional;

import java.io.*;
import java.util.StringTokenizer;

public class Conditional_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        if (minute>=45) {
            System.out.println(hour + " " + (minute-45));
        } else {
            if (hour==0) {
                hour = 24;
            }
            System.out.println((hour - 1) + " " + (60 + minute-45));
        }
    }
}
