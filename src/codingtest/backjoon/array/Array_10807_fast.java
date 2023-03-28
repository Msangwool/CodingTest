package codingtest.backjoon.array;

import java.io.*;
import java.util.StringTokenizer;

public class Array_10807_fast {
    public static void main(String[] args) throws IOException{
        int test;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        test = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            if(N>100 | N<0){
                break;
            }
            int a = Integer.parseInt(st.nextToken());
            if(a<-100 | a>100 | test>100 | test<-100){
                break;
            }
            else if(a == test){
                count++;
            }
        }
        System.out.println(count);
    }
}
