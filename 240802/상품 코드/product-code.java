import java.io.*;
import java.util.*;

class Product {
    String name;
    int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Product pro1 = new Product("codetree", 50);
        Product pro2 = new Product(st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("product " + pro1.code + " is " + pro1.name);
        System.out.println("product " + pro2.code + " is " + pro2.name);
    }
}