package codingtest.backjoon.basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_2752 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>1000000 | arr[i]<1){
                return;
            }
        }

        Arrays.sort(arr);

        for (int j : arr) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);
    }
}
