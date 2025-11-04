import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        String[] sizes = {"S", "M", "L", "XL", "XXL", "XXXL"};
        TreeMap<String, Integer> shirts = new TreeMap<>(Collections.reverseOrder());

        for (String size : sizes) {shirts.put(size, sc.nextInt());}

        int T = sc.nextInt();
        int P = sc.nextInt();
        int totalPacks = 0;

        for (int cnt : shirts.values()) {totalPacks += (cnt + T - 1) / T;}

        System.out.println(totalPacks);
        System.out.println((people / P) + " " + (people % P));
    }
}
