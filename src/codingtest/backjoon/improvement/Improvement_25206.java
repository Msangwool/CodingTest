package codingtest.backjoon.improvement;

import java.io.*;
import java.util.StringTokenizer;

public class Improvement_25206 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0;
        double creditsSum = 0;
        String subjectName;
        double credits;
        String gradesStr;
        double gradesNum;

        for (int i = 0; i < 20; i++) {

            st = new StringTokenizer(br.readLine());

            subjectName = st.nextToken();
            if (1 > subjectName.length() | subjectName.length() > 50) {
                return;
            }

            credits = Double.parseDouble(st.nextToken());

            gradesStr = st.nextToken();
            gradesNum = getGradesNum(gradesStr);

            if (gradesNum == -1){
                continue;
            }

            creditsSum += credits;
            sum += credits * gradesNum;
        }

        System.out.printf("%f", sum/creditsSum);
    }

    private static double getGradesNum(String gradesStr) {
        switch (gradesStr) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return (double) -1;
        }
    }
}
