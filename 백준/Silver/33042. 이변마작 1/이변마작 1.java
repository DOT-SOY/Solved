import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> tiles = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        br.close();

        for (int i = 0; i < n; i++) {
            int count = tiles.merge(cards[i], 1, Integer::sum);
            if (count == 5) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("0");
    }
}
