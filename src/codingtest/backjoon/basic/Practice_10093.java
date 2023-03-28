package codingtest.backjoon.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Practice_10093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if(a>b & a>0 & b>0) {
            if(b<1 | a>Math.pow(10, 15) | a-b>100000){
                System.exit(0);
            }
            System.out.println(a-b-1);
            for(long i = b+1; i<a; i++){
                System.out.print(i + " ");
            }
        }
        else if(b>a & a>0 & b>0) {
            if(a<1 | b>Math.pow(10, 15) | a-b>100000){
                System.exit(0);
            }
            System.out.println(b-a-1);
            for(long i = a+1; i<b; i++){
                System.out.print(i + " ");
            }
        }
        else {
            System.exit(0);
        }
    }
}
