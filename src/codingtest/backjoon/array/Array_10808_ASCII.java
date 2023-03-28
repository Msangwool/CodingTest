package codingtest.backjoon.array;

import java.util.Scanner;

public class Array_10808_ASCII {
    public static void main(String[] args){
        int ascii = 97;
        int[] alpabetPrint = new int[26];

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.length() > 100){
            System.exit(0);
        }

        for(int i=0; i<alpabetPrint.length; i++){
            for(int j = 0; j<str.length(); j++){
                if(ascii == str.charAt(j)){
                    alpabetPrint[i]++;
                }
            }
            ascii++;
            System.out.print(alpabetPrint[i] + " ");
        }
    }
}