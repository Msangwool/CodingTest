package codingtest.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_10808 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int ascii = 97;
        int[] alpabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] alpabetPrint = new int[26];

        String str = br.readLine();

        if(str.length() > 100){
            System.exit(0);
        }

        for(int i=0; i<alpabet.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alpabet[i] == str.charAt(j)) {
                    alpabetPrint[i]++;
                }
            }
            sb.append(alpabetPrint[i]).append(" ");
        }

        System.out.println(sb);
    }
}
