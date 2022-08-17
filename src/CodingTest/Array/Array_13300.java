package CodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_13300 {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][2];
        int count = 0 ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        if(n>1000 | n<1){
            System.exit(0);
        }
        int test = Integer.parseInt(st.nextToken());
        if(test>1000 | test<1){
            System.exit(0);
        }

        for(int i=0; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            for(int j=1; j<=6; j++){
                if(grade == j){
                    if(sex == 0){
                        arr[j-1][0]++;
                        break;
                    } else {
                        arr[j-1][1]++;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<6; i++){
            for(int j=0; j<2; j++){
                if(arr[i][j] == 0){
                    continue;
                } else if(arr[i][j] % test == 0){
                    count += arr[i][j]/test;
                } else if(arr[i][j] % test >= 1){
                    count += (arr[i][j]/test + 1);
                }
            }
        }
        System.out.println(count);
    }
}
