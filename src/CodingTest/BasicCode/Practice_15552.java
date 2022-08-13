package CodingTest.BasicCode;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());


        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>1000 | b>1000 | a<1 | b<1){
                return;
            }
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }
}
