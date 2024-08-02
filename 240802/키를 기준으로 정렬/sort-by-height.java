import java.io.*;
import java.util.*;

class User {
    String name;
    int height;
    int weight;

    public User(String n, int h, int w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        User[] user = new User[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            user[i] = new User(name, h, w);
        }

        Arrays.sort(user, (o1, o2) -> {
            return o1.height - o2.height;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(user[i].name + " " + user[i].height + " " + user[i].weight);
        }
    }
}