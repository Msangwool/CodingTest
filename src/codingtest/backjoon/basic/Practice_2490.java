package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_2490 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[][] yut = new int[3][4];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                yut[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sb.append(yutnoli(yut[0])).append("\n");
        sb.append(yutnoli(yut[1])).append("\n");
        sb.append(yutnoli(yut[2])).append("\n");

        bw.write(sb + "");
        bw.flush();
        bw.close();
    }

    static char yutnoli(int[] arr){
        int max = arr[0] + arr[1] + arr[2] + arr[3];

        if(max==3){
            return 'A';
        }
        else if (max == 2){
            return 'B';
        }
        else if (max == 1){
            return 'C';
        }
        else if (max == 0){
            return 'D';
        }
        else {
            return 'E';
        }
    }
}
