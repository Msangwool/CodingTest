package CodingTest.BasicCode;

import java.io.*;

public class Practice_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if( a>100 | a<1 ){
            return;
        }

        for(int i=1; i<=a; i++){
            for(int j=1; j<i; j++){
                bw.write(" ");
            }
            for(int j=0; j<2*(a-i)+1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
