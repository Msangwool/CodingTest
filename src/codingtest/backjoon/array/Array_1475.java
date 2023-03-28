package codingtest.backjoon.array;

import java.io.*;

public class Array_1475 {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if(a>1000000 | a<0){
            System.exit(0);
        }

        String str = String.valueOf(a);

        int[] value = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            value[i] = Character.getNumericValue(str.charAt(i));
        }

        while(true) {
            int[] cheak = { 1, 1, 1, 1, 1, 1, 2, 1, 1};
            int sum = 0;
            count++;
            for (int i = 0; i < value.length; i++) {
                if (value[i] >= 0) {
                    for(int j=0; j<10; j++) {
                        if (value[i] == 6 | value[i] == 9) {
                            if (cheak[6] > 0) {
                                cheak[6]--;
                                value[i] = -1;
                                break;
                            }
                        } else if (value[i] == j) {
                            if (cheak[j] > 0) {
                                cheak[j]--;
                                value[i] = -1;
                                break;
                            }
                        }
                    }
                }
            }
            for(int i=0; i<value.length; i++){
                sum += value[i];
            }
            if(sum == -value.length){
                break;
            }
        }
        System.out.println(count);
    }
}