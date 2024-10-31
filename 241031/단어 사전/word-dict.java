import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");

        Arrays.sort(str);

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }

        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}