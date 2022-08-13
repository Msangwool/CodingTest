package CodingTest.BasicCode;

import java.util.Scanner;

public class Practice_2490 {
    public static void main(String[] args){
        int[][] yut = new int[3][4];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                yut[i][j] = sc.nextInt();
            }
        }

        System.out.println(yutnoli(yut[0]));
        System.out.println(yutnoli(yut[1]));
        System.out.println(yutnoli(yut[2]));
    }

    static char yutnoli(int[] arr){
        int max = arr[0] + arr[1] + arr[2] + arr[3];

        if(max==3){
            return 'A';
        }
        else if (max == 2){
            return 'B';
        }
        else if (max == 1){
            return 'C';
        }
        else if (max == 0){
            return 'D';
        }
        else {
            return 'E';
        }
    }
}
