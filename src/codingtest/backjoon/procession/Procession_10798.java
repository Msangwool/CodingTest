package codingtest.backjoon.procession;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Procession_10798 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        List<String> strings = new ArrayList<>();
        String str;
        int max = 0;

        while ((str = br.readLine()) != null) {
            strings.add(str);
            if (max < str.length()) {
                max = str.length();
            }
        }

        for (int i = 0; i < max; i++) {
            for (String string : strings) {

                if (string.length() > i) {
                    sb.append(string.charAt(i));
                }
            }
        }

        bw.write(sb + "");
        bw.close();
    }
}
