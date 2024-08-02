import java.io.*;
import java.util.*;

class User {
    String id;
    int s;

    public User(String id, int s) {
        this.id = id;
        this.s = s;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        User[] userArr = new User[5];        

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String id = st.nextToken();
            int s = Integer.parseInt(st.nextToken());

            userArr[i] = new User(id, s);
        }

        Arrays.sort(userArr, (o1, o2) -> {
            return o1.s - o2.s;
        });

        System.out.println(userArr[0].id + " " + userArr[0].s);
    }
}