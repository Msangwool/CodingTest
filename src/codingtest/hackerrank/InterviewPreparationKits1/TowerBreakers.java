package codingtest.hackerrank.InterviewPreparationKits1;


import java.io.*;
import java.util.stream.*;

public class TowerBreakers {

    static class Result {

        /*
         * Complete the 'towerBreakers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER m
         */

        public static int towerBreakers(int n, int m) {
            // Write your code here

            // 너무 간단해서 어이가 없는 문제
            // 결국, n 이 1 이 될 때까지 기둥을 줄일 수 있고,
            // 모든 기둥이 1 일 때 차례가 된 사람이 패배하는 게임

            // 1. 시작부터 모든 기둥이 1 이라면 무조건 1번 플레이어의 패배이다
            // 2. 기둥의 개수가 짝수라면 2번 플레이어는 최적의 플레이로 1번 플레이어의 동작을 따라하면 승리한다
            // 이외의 모든 경우의 수는 1번이 이긴다
            return m == 1 || n % 2 == 0 ? 2 : 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.towerBreakers(n, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
