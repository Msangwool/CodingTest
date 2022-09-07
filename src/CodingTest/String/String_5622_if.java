package CodingTest.String;

import java.io.*;

public class String_5622_if {
    public static int ringring(char ch){
        if ((int)ch >= 86){
            return 10;
        } else if ((int)ch >= 83){
            return 9;
        } else if ((int)ch >= 80){
            return 8;
        } else if ((int)ch >= 77){
            return 7;
        } else if ((int)ch >= 74){
            return 6;
        } else if ((int)ch >= 71){
            return 5;
        } else if ((int)ch >= 68){
            return 4;
        } else if ((int)ch >= 65){
            return 3;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            sum += ringring(str.charAt(i));
        }
        System.out.println(sum);
    }
}
