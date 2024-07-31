import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BigInteger num = new BigInteger(str, 2);
        BigInteger res = num.multiply(BigInteger.valueOf(17));

        System.out.println(res.toString(2));

    }
}