import java.io.*;
import java.util.*;

class User {
    String id;
    int lv;

    public User(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        User user1 = new User("codetree", 10);
        User user2 = new User(st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("user " + user1.id + " lv " + user1.lv);
        System.out.println("user " + user2.id + " lv " + user2.lv);
    }
}