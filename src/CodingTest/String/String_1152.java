package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0 ;
        String[] strArr = br.readLine().split(" ");
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] == null || strArr[i].length() == 0){
                count++;
            }
        }
        System.out.println(strArr.length - count);
    }
}
