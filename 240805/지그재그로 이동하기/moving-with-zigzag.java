import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean direction = true;
        int distance = 1;
        int next = 0;
        int current = a;
        int result = 0;

        while (true) {
            next = direction ? a + distance : a - distance;

            if (direction && current < b && next >= b) {
                result += b - current;
                break;

            } else if (!direction && current > b && next <= b) {
                result += current - b;
                break;
            }

            result += next > current ? next - current : current - next;
            
            current = next;
            distance *= 2;
            direction = !direction;
        }

        System.out.println(result);
    }
}