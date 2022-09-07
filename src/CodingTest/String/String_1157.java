package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, test=0;
        int[] arr = new int[26];
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            int number = (int)str.charAt(i);
            if(number<97){
                number -= 65;
            } else {
                number -= 97;
            }
            arr[number]++;
        }
        max = -1;
        char result = '?';
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                result = (char)('A' + i);
            } else if (arr[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
