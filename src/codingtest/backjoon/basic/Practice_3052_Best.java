package codingtest.backjoon.basic;

import java.io.*;
import java.util.Arrays;

public class Practice_3052_Best {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        int c, j=0, count=1;

        for(int i =0; i<10; i++){
            c = Integer.parseInt(br.readLine());

            if(c>1000 | c<0){
                System.exit(0);
            }
            arr[i] = c%42;
        }
        Arrays.sort(arr);
        c = arr[j];
        j++;
        while(j<10){
            if(c == arr[j]){
                j++;
            } else {
                c = arr[j];
                count++;
                j++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
