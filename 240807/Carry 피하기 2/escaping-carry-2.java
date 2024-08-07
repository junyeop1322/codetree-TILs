import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = -1;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (isCarry(arr[i], arr[j], arr[k])) {
                        ans = Math.max(ans, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isCarry(int a, int b, int c) {
        boolean check = true;

        if(a % 10 + b % 10 + c % 10 >= 10)
            check = false;
                    
        if(a % 100 / 10 + b % 100 / 10 + c % 100 / 10 >= 10)
            check = false;
                    
        if(a % 1000 / 100 + b % 1000 / 100 + c % 1000 / 100 >= 10)
            check = false;
                    
        if(a % 10000 / 1000 + b % 10000 / 1000 + c % 10000 / 1000 >= 10)
        check = false;

        return check;
    }
}