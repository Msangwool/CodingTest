package codingtest.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_3052 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int[] arr = new int[10];
        int c, j=0, count=1;

        for(int i =0; i<10; i++){
            c = Integer.parseInt(br.readLine());

            if(c>1000 | c<0){
                System.exit(0);
            }
            arr[i] = (c%42);
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

        System.out.println(count);
    }
}
