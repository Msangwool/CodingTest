package codingtest.backjoon.basic;

import java.io.*;
import java.util.Arrays;

public class Practice_2576 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] arr = new int[7];
        int[] arrCopy = new int[7];
        int test=0;
        int j=0;
        int sum=0;

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] < 0 & arr[i] > 100){
                return;
            }
            if(arr[i]%2==1){
                test++;
            }
        }

        for (int k : arr) {
            if (k % 2 == 1) {
                arrCopy[j] = k;
                sum += arrCopy[j];
                j++;
            }
        }

        if(test==0){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arrCopy);

        bw.write(sum + "");
        bw.newLine();
        bw.write(arrCopy[7-j] + "");
        bw.flush();
        bw.close();
    }
}
