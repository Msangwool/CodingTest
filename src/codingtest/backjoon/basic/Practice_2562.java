package codingtest.backjoon.basic;

import java.io.*;

public class Practice_2562 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        int max = 0,j=0;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]<1 | arr[i]>100){
                return;
            }
            if(arr[i]>max){
                max = arr[i];
                j=i;
            }
        }

        sb.append(max).append("\n");
        sb.append(j + 1);

        System.out.println(sb);
    }
}
