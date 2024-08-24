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
import java.io.*;
 
public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
 
    static int n,k;
    static int[][] grid;
    static int[][] pos;    // 시작 위치, 도착 위치 저장용 배열
 
    // findMin용
    static List<int[]> walls = new ArrayList<>();   // 벽 위치 저장용 리스트
    static List<Integer> list = new ArrayList<>();
 
    // bfs용
    static boolean[][] visited;
 
    static int answer = Integer.MAX_VALUE;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
 
        grid = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < n ; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
 
                if(grid[i][j] == 1) walls.add(new int[] {i, j});
            }
        }
 
        pos = new int[2][2];
        for(int i = 0 ; i < 2 ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
 
            pos[i][0] = r;
            pos[i][1] = c;
        }
 
        visited = new boolean[n][n];
        findMin(0, 0);
        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }
 
    private static void findMin(int idx, int depth) {
        if(depth == k) {
            // 1. 벽 제거하기
            for(int i : list) {
                int[] num = walls.get(i);
                grid[num[0]][num[1]] = 0;
            }
 
            // 2. 최소 시간 구하기
            bfs(pos[0][0], pos[0][1]);
 
            // 3. 벽 원상복구하기
            for(int i : list) {
                int[] num = walls.get(i);
                grid[num[0]][num[1]] = 1;
            }
 
            return;
        }
 
        for(int i = idx ; i < walls.size() ; i++) {
            list.add(i);
            findMin(i + 1, depth + 1);
            list.remove(list.size() - 1);
        }
    }
 
    private static void init() {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                visited[i][j] = false;
            }
        }        
    }
 
    private static void bfs(int x, int y) {
        init();
        int[][] dist = new int[n][n];
 
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {x, y});
 
        visited[x][y] = true;
 
        while(!q.isEmpty()) {
            int[] now = q.poll();
 
            for(int dir = 0 ; dir < 4 ; dir++) {
                int nx = now[0] + dx[dir];
                int ny = now[1] + dy[dir];
 
                if(canGo(nx, ny)) {
                    visited[nx][ny] = true;
                    q.add(new int[] {nx, ny});
                    dist[nx][ny] = dist[now[0]][now[1]] + 1;
                }
            }
        }
 
        int endR = pos[1][0];
        int endC = pos[1][1];
        if(visited[endR][endC]) {
            answer = Math.min(answer, dist[endR][endC]);
        }
    }
 
    private static boolean canGo(int x, int y) {
        return (inRange(x, y) && !visited[x][y] && grid[x][y] == 0);
    }
 
    private static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}