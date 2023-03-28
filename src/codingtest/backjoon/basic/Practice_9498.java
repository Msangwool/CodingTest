package codingtest.backjoon.basic;

import java.util.Scanner;

public class Practice_9498 {
    public static void main(String[] args){
        int score;

        Scanner sc = new Scanner(System.in);

        score = sc.nextInt();

        System.out.println(scores(score));
    }

    static char scores(int score){
        if(score > 100){
            return 'e';
        }
        else if (score>=90){
            return 'A';
        }
        else if (score>=80){
            return 'B';
        }
        else if (score>=70){
            return 'C';
        }
        else if (score>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
