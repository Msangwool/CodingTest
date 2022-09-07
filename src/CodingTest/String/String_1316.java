package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            boolean[] arr = new boolean[26];
            boolean test = true;
            String str = br.readLine();
            arr[(int)str.charAt(0)-97] = true;
            for (int j=1; j<str.length(); j++) {
                if (str.charAt(j-1) == str.charAt(j)) {
                    continue;
                } else {
                    if (arr[(int)str.charAt(j)-97] == true) {
                        test = false;
                        break;
                    } else {
                        arr[(int)str.charAt(j)-97] = true;
                        continue;
                    }
                }
            }
            if(test != false){
                count++;
            }
        }
        System.out.println(count);
    }
}
