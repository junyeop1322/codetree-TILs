import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<String> students = Arrays.asList("Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta");

        Map<String, Integer> scores = new HashMap<>();
        for (String student : students) {
            scores.put(student, 0);
        }

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            scores.put(name, score);
        }

        Set<Integer> uniqueScores = new TreeSet<>(scores.values());
        if (uniqueScores.size() < 2) {
            System.out.println("Tie");
            return;
        }

        Iterator<Integer> it = uniqueScores.iterator();
        int firstLowest = it.next();
        int secondLowest = it.next();

        List<String> secondLowestStudents = new ArrayList<>();
        for (String student : students) {
            if (scores.get(student) == secondLowest) {
                secondLowestStudents.add(student);
            }
        }

        if (secondLowestStudents.size() == 1) {
            System.out.println(secondLowestStudents.get(0));
        } else {
            System.out.println("Tie");
        }


        br.close();
    }
}