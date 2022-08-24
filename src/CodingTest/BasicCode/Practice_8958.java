package CodingTest.BasicCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] arr;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int j=0; j<n; j++) {
            str = br.readLine();

            if(str.length() > 80){
                System.exit(0);
            }

            int count = 1, sum = 0;

            arr = str.split("");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("O")) {
                    sum += count;
                    count++;
                } else {
                    count = 1;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
