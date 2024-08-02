import java.io.*;
import java.util.*;

class User {
    String name;
    String addr;
    String city;

    public User(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
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
            String addr = st.nextToken();
            String city = st.nextToken();

            user[i] = new User(name, addr, city);
        }

        Arrays.sort(user, (o1, o2) -> {
            return o2.name.compareTo(o1.name);
        });

        System.out.println("name " + user[0].name);
        System.out.println("addr " + user[0].addr);
        System.out.println("city " + user[0].city);

    }
}