package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 1, 2, 2, 2, 8};
        int number;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb  = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            number = Integer.parseInt(st.nextToken());
            if(number>10 | number<0){
                System.exit(0);
            }
            sb.append(arr[i]-number).append(" ");
        }
        System.out.println(sb);
    }
}
