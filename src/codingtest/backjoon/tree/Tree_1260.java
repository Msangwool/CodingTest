package codingtest.backjoon.tree;

import java.util.StringTokenizer;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Tree_1260 {
    static int[][] matrix;
    static boolean[] visitedState;
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final StringBuilder sbDfs = new StringBuilder();
    static final StringBuilder sbBfs = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 탐색을 시작할 정점 번호

        //인접행렬 생성
        matrix = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        visitedState = new boolean[N + 1];
        dfs(V);
        visitedState = new boolean[N + 1];
        bfs(V);

        System.out.println(sbDfs);
        System.out.println(sbBfs);
    }

    //깊이우선탐색(재귀)
    public static void dfs(int node) {

        visitedState[node] = true;
        sbDfs.append(node).append(" ");

        for (int i = 1; i < matrix.length; i++) {
            if (!visitedState[i] && matrix[node][i] == 1) {
                dfs(i);
            }
        }
    }

    //너비우선탐색(큐)
    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<>();

        que.add(V);

        while(!que.isEmpty()) {
            int verifier = que.poll();

            if (visitedState[verifier]) continue;

            visitedState[verifier] = true;
            sbBfs.append(verifier).append(" ");

            for(int i = 1; i < matrix.length; i++) {
                if(matrix[verifier][i] == 1 && !visitedState[i]) {
                    que.add(i);
                }
            }
        }
    }
}