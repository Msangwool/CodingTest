package codingtest.backjoon.array;

import java.util.Scanner;

public class Array_10808 {
    public static void main(String[] args){
        int ascii = 97;
        int[] alpabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] alpabetPrint = new int[26];

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.length() > 100){
            System.exit(0);
        }

        for(int i=0; i<alpabet.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alpabet[i] == str.charAt(j)) {
                    alpabetPrint[i]++;
                }
            }
            System.out.print(alpabetPrint[i] + " ");
        }
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//        String[] strArr = str.split("");
//
//        for(int i=0; i<alpabet.length; i++){
//            for(int j = 0; j<strArr.length; j++){
//                if(Integer.parseInt(strArr[j]) == ascii){
//                    alpabet[i]++;
//                }
//            }
//            ascii++;
//        }
    }
}
