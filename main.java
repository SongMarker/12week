import java.util.*;

public class Main {

    static List<List<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        visited = new boolean[n + 1];
        int result = bfs(a, b);
        System.out.println(result);
    }

    static int bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        // {현재 노드, 현재까지 거리}
        queue.offer(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int node = cur[0];
            int dist = cur[1];

            if (node == target) return dist;

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, dist + 1});
                }
            }
        }
        return -1; // 연결 없음
    }
}