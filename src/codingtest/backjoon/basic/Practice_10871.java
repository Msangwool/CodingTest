package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_10871 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N, X;

        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        int[] intArr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder stringBuilder = printMethod(intArr, X);

        bw.write(stringBuilder + "");
        bw.flush();
        bw.close();
    }

    public static StringBuilder printMethod(int[] arr, int x){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            if(arr[i]<x){
                sb.append(arr[i]).append(" ");
            }
        }

        return sb;
    }
}
