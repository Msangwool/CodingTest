package CodingTest.Array;

import java.io.*;

public class Array_2577 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        int[] number = new int[3];
        int sum = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<number.length; i++){
            number[i] = Integer.parseInt(br.readLine());
            if(number[i]>1000 | number[i]<100){
                System.exit(0);
            }
            sum *= number[i];
        }

        String numberSum = String.valueOf(sum);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<numberSum.length(); j++){
                if(Character.getNumericValue(numberSum.charAt(j)) == i ){
                    arr[i]++;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
