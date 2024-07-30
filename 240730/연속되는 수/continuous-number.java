import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st.nextToken());
            list.add(n);
            set.add(n);
        }

        int maxCnt = 0;

        for(Integer K : set){
            int prevNum = -1;
            int cnt = 0;
            for(int i = 0; i < list.size(); i++){
                int currNum = list.get(i);
                if(currNum == K) 
                    continue;
                else if(prevNum == currNum) 
                    cnt++;
                else 
                    cnt = 0;
                prevNum = currNum;
                maxCnt = Math.max(maxCnt, cnt);
            }
        }

        System.out.println(maxCnt + 1);
    }
}