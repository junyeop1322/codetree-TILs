import java.io.*;
import java.util.*;

public class Main {

    static char[][] map = new char[8][8];

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        if (map[7][0] == '#') {
            System.out.println(0);
            return;
        }

        map[7][0] = '!';

        while(true) {
            if (map[0][7] == '!') {
                System.out.println(1);
                return;
            }
            if (!checkPeople()) {
                break;
            }
            
            movePeople();
            moveWall();

        }

        System.out.println(0);
    }

    static boolean checkPeople() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == '!') {
                    return true;
                }
            }
        }

        return false;
    }

    static void movePeople() {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == '!') {
                    q.add(new int[] {i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= 8 || ny >= 8) {
                    continue;
                }

                if (map[nx][ny] == '.') {
                    map[nx][ny] = '!';
                }
            }
        }
    }

    static void moveWall() {
        int[][] arr = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] =='#') {
                    arr[i][j] = 1;
                    map[i][j] = '.';
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == 1) {
                    map[i+1][j] = '#';
                }
            }
        }
        
        // for (int i = 0; i < 8; i++) {
        //     for (int j = 0; j < 8; j++) {
        //         System.out.print(map[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println("------------");
    }
}