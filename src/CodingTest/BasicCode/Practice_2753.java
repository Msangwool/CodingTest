package CodingTest.BasicCode;

import java.util.Scanner;

public class Practice_2753 {
    public static void main(String[] args){
        int year;

        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

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
