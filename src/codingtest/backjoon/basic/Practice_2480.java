package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_2480 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int a,b,c,max;

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        if(a==b&b==c){
            bw.write(10000 + a*1000 + "");
        }
        else if(a==b&a!=c){
            bw.write(1000 + a*100 + "");
        }
        else if(b==c&b!=a){
            bw.write(1000 + b*100 + "");
        }
        else if(c==a&c!=b){
            bw.write(1000 + c*100 + "");
        }
        else{
            if(a>b){
                max = a;
            }else{
                max = b;
            }
            if(max>c){
                bw.write(100*max + "");
            }else{
                bw.write(100*c + "");
            }
        }

        bw.flush();
        bw.close();
    }
}
