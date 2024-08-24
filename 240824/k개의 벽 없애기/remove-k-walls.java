// import java.io.*;
// import java.util.*;

// public class Main {

//     static int n, k;
//     static int[][] arr;

//     static int x1, y1, x2, y2;

//     static int[] dx = {-1, 1, 0, 0};
//     static int[] dy = {0, 0, -1, 1};

//     public static void main(String[] args) throws IOException {
//         // 여기에 코드를 작성해주세요.
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         n = Integer.parseInt(st.nextToken());
//         k = Integer.parseInt(st.nextToken());

//         arr = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             st = new StringTokenizer(br.readLine(), " ");
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = Integer.parseInt(st.nextToken());
//             }
//         }

//         st = new StringTokenizer(br.readLine(), " ");
//         x1 = Integer.parseInt(st.nextToken()) - 1;
//         y1 = Integer.parseInt(st.nextToken()) - 1;

//         st = new StringTokenizer(br.readLine(), " ");
//         x2 = Integer.parseInt(st.nextToken()) - 1;
//         y2 = Integer.parseInt(st.nextToken()) - 1;

//         bfs();
//     }

//     static void bfs() {
//         Queue<int[]> q = new LinkedList<>();
//         boolean[][] visited = new boolean[n][n];

//         q.add(new int[] {x1, y1, 0, 0});
//         visited[x1][y1] = true;

//         while(!q.isEmpty()) {
//             int[] a = q.poll();

//             int x = a[0];
//             int y = a[1];
//             int cnt = a[2];
//             int wall = a[3];

//             if (x == x2 && y == y2) {
//                 System.out.println(cnt);
//                 return;
//             }

//             for (int i = 0; i < 4; i++) {
//                 int nx = x + dx[i];
//                 int ny = y + dy[i];

//                 if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
//                     if (!visited[nx][ny]) {
//                         if (arr[nx][ny] == 1) {
//                             if (wall < k) {
//                                 visited[nx][ny] = true;
//                                 q.add(new int[] {nx, ny, cnt+1, wall+1});
//                             }
//                         } else {
//                             visited[nx][ny] = true;
//                             q.add(new int[] {nx, ny, cnt+1, wall});
//                         }
//                     }
//                 }
//             }
//         }

//         System.out.println(-1);
//     }
// }

import java.util.*;

public class Main {

    static int n, k;
    static int[][] grid;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Point {
        int r, c, dist;
        Point(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        grid = new int[n][n];
        List<Point> walls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 1) {
                    walls.add(new Point(i, j, 0));
                }
            }
        }

        int r1 = sc.nextInt() - 1;
        int c1 = sc.nextInt() - 1;
        int r2 = sc.nextInt() - 1;
        int c2 = sc.nextInt() - 1;

        int minTime = Integer.MAX_VALUE;
        if (r1 == r2 && c1 == c2) {
            System.out.println(0);
            return;
        }

        if (k == 0) {
            int result = bfs(r1, c1, r2, c2, new boolean[n][n]);
            System.out.println(result);
            return;
        }

        boolean[] selected = new boolean[walls.size()];
        minTime = findMinTime(walls, selected, 0, 0, r1, c1, r2, c2);

        System.out.println(minTime == Integer.MAX_VALUE ? -1 : minTime);
    }

    static int findMinTime(List<Point> walls, boolean[] selected, int start, int count, int r1, int c1, int r2, int c2) {
        if (count == k) {
            boolean[][] removedGrid = new boolean[n][n];
            for (int i = 0; i < walls.size(); i++) {
                if (selected[i]) {
                    Point p = walls.get(i);
                    removedGrid[p.r][p.c] = true;
                }
            }
            return bfs(r1, c1, r2, c2, removedGrid);
        }

        int minTime = Integer.MAX_VALUE;
        for (int i = start; i < walls.size(); i++) {
            selected[i] = true;
            minTime = Math.min(minTime, findMinTime(walls, selected, i + 1, count + 1, r1, c1, r2, c2));
            selected[i] = false;
        }
        return minTime;
    }

    static int bfs(int r1, int c1, int r2, int c2, boolean[][] removedGrid) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.add(new Point(r1, c1, 0));
        visited[r1][c1] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.r == r2 && current.c == c2) {
                return current.dist;
            }

            for (int d = 0; d < 4; d++) {
                int nr = current.r + dr[d];
                int nc = current.c + dc[d];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    if (grid[nr][nc] == 0 || removedGrid[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.add(new Point(nr, nc, current.dist + 1));
                    }
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}