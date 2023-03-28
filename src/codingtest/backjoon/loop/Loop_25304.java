package codingtest.backjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum=0;
        int resultPrice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        if (resultPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}