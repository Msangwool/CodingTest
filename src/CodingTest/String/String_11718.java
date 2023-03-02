package CodingTest.String;

import java.io.*;

public class String_11718 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null) {
            if (str.length() > 100) {
                break;
            }
            sb.append(str).append("\n");
        }

        bw.write(sb + "");
        bw.close();
    }
}
