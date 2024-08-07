import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] != 0 && func(arr[i][j], i, j)) {
                    return;
                }
            }
        }

    }

    static boolean func(int n, int x, int y) {
        boolean check = true;

        int cnt = 0;
        int sx = x;
        int sy = y;
        for (int i = 0; i < 5; i++) {
            if (arr[sx][sy] != n) {
                check = false;
                break;
            }

            int nx = sx + 1;
            int ny = sy;

            if (nx >= 0 && ny >= 0 && nx < 19 && ny < 19) {
                sx = nx;
                sy = ny;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(n);
            System.out.println((x+1+2) + " " + (y+1));

            return check;
        }

        check = true;
        sx = x;
        sy = y;
        for (int i = 0; i < 5; i++) {
            if (arr[sx][sy] != n) {
                check = false;
                break;
            }

            int nx = sx;
            int ny = sy + 1;

            if (nx >= 0 && ny >= 0 && nx < 19 && ny < 19) {
                sx = nx;
                sy = ny;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(n);
            System.out.println((x+1) + " " + (y+1+2));

            return check;
        }

        check = true;
        sx = x;
        sy = y;
        for (int i = 0; i < 5; i++) {
            if (arr[sx][sy] != n) {
                check = false;
                break;
            }

            int nx = sx + 1;
            int ny = sy + 1;

            if (nx >= 0 && ny >= 0 && nx < 19 && ny < 19) {
                sx = nx;
                sy = ny;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(n);
            System.out.println((x+1+2) + " " + (y+1+2));

            return check;
        }

        check = true;
        sx = x;
        sy = y;
        for (int i = 0; i < 5; i++) {
            if (arr[sx][sy] != n) {
                check = false;
                break;
            }

            int nx = sx + 1;
            int ny = sy - 1;

            if (nx >= 0 && ny >= 0 && nx < 19 && ny < 19) {
                sx = nx;
                sy = ny;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(n);
            System.out.println((x+1+2) + " " + (y+1-2));

            return check;
        } else {
            return check;
        }

    }
}