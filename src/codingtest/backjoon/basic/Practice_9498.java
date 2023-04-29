package codingtest.backjoon.basic;

import java.io.*;

public class Practice_9498 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        bw.write(scores(Integer.parseInt(br.readLine())) + "");
        bw.flush();
        bw.close();
    }

    static char scores(int score){
        if(score > 100){
            return 'e';
        }
        else if (score>=90){
            return 'A';
        }
        else if (score>=80){
            return 'B';
        }
        else if (score>=70){
            return 'C';
        }
        else if (score>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
