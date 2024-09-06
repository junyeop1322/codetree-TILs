import java.io.*;
import java.util.*;

public class Main {
    static int maxXOR = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] selected = new int[m];
        
        findMaxXOR(arr, selected, 0, 0, n, m);
        
        System.out.println(maxXOR);
    }
    
    public static void findMaxXOR(int[] arr, int[] selected, int start, int depth, int n, int m) {
        if (depth == m) {
            int xorResult = 0;

            for (int num : selected) {
                xorResult ^= num;
            }

            maxXOR = Math.max(maxXOR, xorResult);
            return;
        }
        
        for (int i = start; i < n; i++) {
            selected[depth] = arr[i];
            findMaxXOR(arr, selected, i + 1, depth + 1, n, m);
        }
    }
}