import java.io.*;
import java.util.*;

public class Main {
    static class Pair {
        int num;
        String text;
        Pair(int num, String text) {
            this.num = num;
            this.text = text;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        Pair[] arr = new Pair[testCase];

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String text = st.nextToken();
            arr[i] = new Pair(num, text);
        }

        Arrays.sort(arr, (a, b) -> a.num - b.num);

        StringBuilder sb = new StringBuilder();
        for (Pair p : arr) {
            sb.append(p.num).append(" ").append(p.text).append("\n");
        }

        System.out.print(sb);
    }
}
