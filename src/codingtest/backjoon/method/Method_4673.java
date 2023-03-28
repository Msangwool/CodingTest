package codingtest.backjoon.method;

public class Method_4673 {
    public static int d(int i) {
        int thousand, hundred, ten ;
        if(i>=1000) {
            thousand = i/1000 ;
            hundred = (i%1000)/100 ;
            ten = (i%100)/10 ;
            return i + thousand + hundred + ten + i%10 ;
        } else if (i>=100) {
            hundred = i/100 ;
            ten = (i%100)/10 ;
            return i + hundred + ten + i%10 ;
        } else if (i>=10) {
            ten = i/10 ;
            return i + ten + i%10 ;
        } else {
            return i+i ;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10001] ;
        for (int i=1; i<10001; i++) {
            int m = d(i);
            if(m>10000){
                continue;
            }
            arr[m] = 1 ;
        }
        for (int i=1; i<10001; i++) {
            if(arr[i] == 0){
                System.out.println(i) ;
            }
        }
    }
}
