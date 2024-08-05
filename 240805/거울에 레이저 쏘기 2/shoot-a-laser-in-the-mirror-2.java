import java.util.*;
import java.io.*;

public class Main {
    static int n, k;
    static char[][] grid;
    static int[] dx = {1, 0, -1, 0}; // 하 우 상 좌 (방향)
    static int[] dy = {0, 1, 0, -1};
    static class Pair { // 좌표를 담기 위한 객체 자료형
        int x, y, dir;

        Pair(int x, int y, int dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        grid = new char[n][n]; // 격자 초기화
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                grid[i][j] = str[j].charAt(0);
            }
        }

        k = Integer.parseInt(br.readLine());

        int x = 0, y = 0;
        Pair[] arr = new Pair[4 * n]; // 레이저가 들어오는 좌표를 담기 위한 객체 배열

        int dir = 1; // 방향 초기값
        int direction = 0; // 레이저 초기 좌표값
        arr[0] = new Pair(x, y, direction);

        for (int i = 1; i < 4 * n; i++) { // 테두리 좌표 저장
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                dir = (dir + 3) % 4; // 테두리를 돌기 위한 방향값
                direction = (direction + 3) % 4; // 레이저가 들어오는 방향 저장
                arr[i] = new Pair(x, y, direction);
                continue;
            }

            arr[i] = new Pair(nx, ny, direction);
            x = nx;
            y = ny;
        }

        System.out.println(bfs(arr[k - 1]));
    }

    private static int bfs(Pair cur) {
        int x = cur.x;
        int y = cur.y;
        int dir = cur.dir;

        int ans = 0;
        while (true) {
            int nx = 0, ny = 0;

            if (grid[x][y] == '/') { // 각 상황에 맞는 레이저의 방향 설정
                if (dir % 2 == 0) {
                    dir = (dir + 3) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                } else {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }
            } else {
                if (dir % 2 == 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                } else {
                    dir = (dir + 3) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }
            }
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) { // 만약 레이저가 격자를 탈출하면 break
                break;
            }
            x = nx;
            y = ny;
        }
        return ans;
    }
}