package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream. Collectors.toList;

class Result {

    static int[][] isMatrix;
    static boolean[] visitedState;

    /*
     * Complete the 'bfs' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. 2D_INTEGER_ARRAY edges
     *  4. INTEGER s
     */

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here

        isMatrix = new int[n + 1][n + 1];
        for (List<Integer> edge : edges) {
            int nodeFirst = edge.get(0);
            int nodeSecond = edge.get(1);

            isMatrix[nodeFirst][nodeSecond] = 1;
            isMatrix[nodeSecond][nodeFirst] = 1;
        }

        visitedState = new boolean[n + 1];

        bfsExcute(s);

        return null;
    }

    public static int[] bfsExcute(int startNode) {
        Queue<Integer> bfsQueue = new LinkedList<>();
        int[] result = new int[isMatrix.length - 1];

        visitedState[startNode] = true;
        bfsQueue.add(startNode);

        while(!bfsQueue.isEmpty()) {
            int verifier = bfsQueue.poll();
            for (int i = 1; i < isMatrix.length; i++) {
                if (isMatrix[verifier][i] == 1 && !visitedState[i]) {
                    result[i - 1] = 6;
                    visitedState[i] = true;
                    bfsQueue.add(i);
                }
            }
        }

        return result;
    }
}

public class ShortestReach {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                List<List<Integer>> edges = new ArrayList<>();

                IntStream.range(0, m).forEach(i -> {
                    try {
                        edges.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int s = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> result = Result.bfs(n, m, edges, s);

                bufferedWriter.write(
                        result.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                                + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
