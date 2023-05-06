package codingtest.backjoon.basic;

import java.io.*;
import java.util.Scanner;

public class Practice_2753 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int year;

        year = Integer.parseInt(br.readLine());

        if(year<1 | year>4000){
            System.out.println("한정 범위를 넘어섰습니다.");
            return;
        }

        yearCalculate(year);
    }

    static void yearCalculate(int year){
        if(year%4 == 0 & (year%100 != 0 | year%400 == 0)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
