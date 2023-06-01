package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class NewYearChaos {

    static class Result {

        /*
         * Complete the 'minimumBribes' function below.
         *
         * The function accepts INTEGER_ARRAY q as parameter.
         */

        public static void minimumBribes(List<Integer> q) {
            // Write your code here

            // 총 변경 횟수
            int bribes = 0;

            // 뒤에서부터 탐색 시작
            for(int i = q.size() - 1; i >= 0; i--) {
                // 만일 두 격차가 2보다 크다면, 전제 조건인 2번을 넘어선 것으로 Too chaotic 을 반환
                if(q.get(i) - (i + 1) > 2) {
                    System.out.println("Too chaotic");
                    return;
                }

                // 뇌물은 2개까지만 허용하므로, 2개
                for(int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                    if(q.get(j) > q.get(i)) {
                        bribes++;
                    }
                }
            }

            System.out.println(bribes);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replace("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toList();

                Result.minimumBribes(q);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

