import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();

        Set<Long> aSet = new HashSet<>();
        char[] numArray = a.toCharArray();
        
        for (int i = 0; i < numArray.length; i++) {
            char ch = numArray[i];
            
            for (char c = '0'; c < '0' + 2; c++) {
                if (c != ch) {
                    numArray[i] = c;
                    aSet.add(Long.parseLong(new String(numArray), 2));
                }
            }
            
            numArray[i] = ch;
        }

        Set<Long> bSet = new HashSet<>();
        numArray = b.toCharArray();
        
        for (int i = 0; i < numArray.length; i++) {
            char ch = numArray[i];
            
            for (char c = '0'; c < '0' + 3; c++) {
                if (c != ch) {
                    numArray[i] = c;
                    bSet.add(Long.parseLong(new String(numArray), 3));
                }
            }
            
            numArray[i] = ch;
        }

        for (Long l : aSet) {
            if (bSet.contains(l)) {
                System.out.println(l);
            }
        }
    }
}