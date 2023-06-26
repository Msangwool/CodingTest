package codingtest.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class BFS_ShortestPath {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] rudder = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int[][] graph;
    static int n, m;

    static class Point {

        int row, col, distance;

        Point(int r, int c, int d) {
            row = r; col = c; distance = d;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        System.out.println(bfsShortestPath(0, 0, n - 1, m - 1));
    }

    static int bfsShortestPath(int startRow, int startCol, int endRow, int endCol) {

        boolean[][] visitedState = new boolean[n][m];

        Queue<Point> queue = new LinkedList<>();

        visitedState[startRow][startCol] = true;
        queue.add(new Point(startRow, startCol, 1));

        while (!queue.isEmpty()) {
            int nodeRow, nodeCol;
            Point verifier = queue.poll();

            if (verifier.row == endRow && verifier.col == endCol) {
                return verifier.distance;
            }

            for (int i = 0; i < 4; i++) {
                nodeRow = verifier.row + rudder[i][0];
                nodeCol = verifier.col + rudder[i][1];

                if (nodeRow < 0 || nodeRow > n - 1 || nodeCol < 0 || nodeCol > m - 1) continue;

                if (visitedState[nodeRow][nodeCol]) continue;

                if (graph[nodeRow][nodeCol] == 0) continue;

                visitedState[nodeRow][nodeCol] = true;

                queue.add(new Point(nodeRow, nodeCol, verifier.distance + 1));
            }
        }

        return - 1;
    }
}
