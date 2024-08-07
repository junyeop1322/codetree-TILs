import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    ans += func(i, j);
                }
            }
        }

        System.out.println(ans);
    }

    static int func(int x, int y) {
        int cnt = 0;

        int sx = x;
        int sy = y;
        boolean check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx+1;
            int ny = sy;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx-1;
            int ny = sy;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx+1;
            int ny = sy+1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx+1;
            int ny = sy-1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx-1;
            int ny = sy+1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx-1;
            int ny = sy-1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx;
            int ny = sy-1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        sx = x;
        sy = y;
        check = true;
        for (int i = 0; i < 2; i++) {
            int nx = sx;
            int ny = sy+1;

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] != 'E') {
                    check = false;
                    break;
                } else {
                    sx = nx;
                    sy = ny;
                }
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            cnt++;
        }

        return cnt;
    }
}