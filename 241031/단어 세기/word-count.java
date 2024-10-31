import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();

        while(true) {
            String str = br.readLine();
            if (str.equals("end")) {
                break;
            }

            String[] arr = str.split(" ");
            
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            List<String> keyList = new ArrayList<>(map.keySet());
            Collections.sort(keyList);

            for (int i = 0; i < keyList.size(); i++) {
                sb.append(keyList.get(i) + " : " + map.get(keyList.get(i)) + "\n");
            }

        }

        System.out.println(sb.toString());
    }
}