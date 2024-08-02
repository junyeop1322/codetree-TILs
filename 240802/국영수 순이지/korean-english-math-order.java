import java.io.*;
import java.util.*;

class User {
    String name;
    int kor;
    int eng;
    int math;

    public User (String n, int k, int e, int m) {
        this.name = n;
        this.kor = k;
        this.eng = e;
        this.math = m;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        User[] user = new User[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String n = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            user[i] = new User(n, k, e, m);
        }

        Arrays.sort(user, (o1, o2) -> {
            if (o1.kor == o2.kor) {
                if (o1.eng == o2.eng) {
                    return o2.math - o1.math;
                } else {
                    return o2.eng - o1.eng;
                }
            } else {
                return o2.kor - o1.kor;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(user[i].name + " " + user[i].kor + " " + user[i].eng + " " + user[i].math);
        }
    }
}