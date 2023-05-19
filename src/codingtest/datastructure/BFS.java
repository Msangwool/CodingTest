package codingtest.datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int[][] matrix;
    static boolean[] visitedState;

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 탐색을 시작할 정점 번호

        //인접행렬 생성
        matrix = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        visitedState = new boolean[N + 1];
        bfs(V);

        System.out.println(sb);
    }

    // 넓이 우선 탐색 (Stack)
    public static void bfs(int V) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(V);

        while(!queue.isEmpty()) {
            int verifier = queue.poll();

            if (visitedState[verifier]) continue;

            visitedState[verifier] = true;
            sb.append(verifier).append(" ");

            for(int i = 1; i < matrix.length; i++) {
                if(matrix[verifier][i] == 1 && !visitedState[i]) {
                    queue.add(i);
                }
            }
        }
    }
}

