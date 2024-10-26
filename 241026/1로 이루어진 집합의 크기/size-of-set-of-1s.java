// import java.util.*;
// import java.io.*;

// public class Main {

//     static int n, m;

//     static int[] dx = {-1, 1, 0, 0};
//     static int[] dy = {0, 0, -1, 1};

//     public static void main(String[] args) throws IOException {
//         // 여기에 코드를 작성해주세요.
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         n = Integer.parseInt(st.nextToken());
//         m = Integer.parseInt(st.nextToken());

//         int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             st = new StringTokenizer(br.readLine(), " ");
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = Integer.parseInt(st.nextToken());
//             }
//         }

//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (arr[i][j] == 0 && check(i, j, arr)) {
//                     arr[i][j] = 1;
//                     ans = Math.max(ans, bfs(arr, i, j));
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//         if (ans == 0) {
//             ans = n*m;
//         }

//         System.out.println(ans);

//     }

//     static boolean check(int x, int y, int[][] arr) {
//         for (int i = 0; i < 4; i++) {
//             int nx = x + dx[i];
//             int ny = y + dy[i];

//             if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
//                 continue;
//             }

//             if (arr[nx][ny] == 1) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     static int bfs(int[][] arr, int x, int y) {
//         Queue<int[]> q = new LinkedList<>();
//         boolean[][] visited = new boolean[n][m];
//         int cnt = 1;

//         visited[x][y] = true;
//         q.add(new int[] {x, y});
//         while(!q.isEmpty()) {
//             int[] cur = q.poll();
//             int sx = cur[0];
//             int sy = cur[1];

//             for (int i = 0; i < 4; i++) {
//                 int nx = sx + dx[i];
//                 int ny = sy + dy[i];

//                 if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
//                     continue;
//                 }

//                 if (arr[nx][ny] == 1 && !visited[nx][ny]) {
//                     cnt++;
//                     visited[nx][ny] = true;
//                     q.add(new int[] {nx, ny});
//                 }
//             }
//         }

//         return cnt;
//     }
// }

import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[][] arr, group;
    static int[] groupSize;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int groupId = 2; // 1을 가진 집합의 ID는 2부터 시작

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        group = new int[n][m];
        groupSize = new int[n * m + 2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 1. DFS로 각 1의 집합의 크기와 그룹 ID를 미리 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && group[i][j] == 0) {
                    groupSize[groupId] = dfs(i, j, groupId);
                    groupId++;
                }
            }
        }

        int maxGroupSize = 0;

        // 2. 0인 칸을 1로 바꿔서 얻을 수 있는 최대 집합 크기 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    Set<Integer> adjacentGroups = new HashSet<>();
                    int possibleSize = 1; // 현재 0을 1로 변경할 예정이므로 크기 1 추가

                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                            int adjGroupId = group[nx][ny];
                            if (adjGroupId > 0 && adjacentGroups.add(adjGroupId)) {
                                possibleSize += groupSize[adjGroupId];
                            }
                        }
                    }
                    maxGroupSize = Math.max(maxGroupSize, possibleSize);
                }
            }
        }

        System.out.println(maxGroupSize);
    }

    // DFS로 연결된 1의 집합을 탐색하고 그룹 ID를 지정하며 크기 반환
    static int dfs(int x, int y, int id) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {x, y});
        group[x][y] = id;
        int size = 1;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 1 && group[nx][ny] == 0) {
                    group[nx][ny] = id;
                    size++;
                    stack.push(new int[] {nx, ny});
                }
            }
        }
        return size;
    }
}