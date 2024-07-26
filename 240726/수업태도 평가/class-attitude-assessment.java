import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] arr = {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
        int[] score = new int[7];

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 7; j++) {
                if (name.equals(arr[j])) {
                    score[j] += num;
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            min = Math.min(min, score[i]);
        }

        int sec = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            if (score[i] != min) {
                sec = Math.min(sec, score[i]);
            }
        }

        if (sec == Integer.MAX_VALUE) {
            System.out.println("Tie");
            return;
        }

        int cnt = 0;
        String s = "";

        for (int i = 0; i < 7; i++) {
            if (score[i] == sec) {
                cnt++;
                s = arr[i];
            }
        }

        if (cnt != 1) {
            System.out.println("Tie");
        } else {
            System.out.println(s);
        }



    }
}