package codingtest.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DFS_Stack {
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

        System.out.println(sb);
    }

    //깊이우선탐색(Stack)
    public static void dfs(int V) {

        Stack<Integer> dfsStack = new Stack<>();

        dfsStack.push(V);

        while (!dfsStack.isEmpty()) {
            int verifier = dfsStack.pop();

            if (visitedState[verifier]) continue;

            visitedState[verifier] = true;
            sb.append(verifier).append(" ");

            for (int i = 1; i < matrix.length; i++) {
                if (!visitedState[i] && matrix[verifier][i] == 1) {
                    dfsStack.push(i);
                }
            }
        }
    }
}