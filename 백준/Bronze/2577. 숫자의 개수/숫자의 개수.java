import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = a * b * c;
        int[] count = new int[10];

        while (num > 0) {
            count[num % 10]++;  // 마지막 자리 숫자 카운트
            num /= 10;          // 마지막 자리 제거
        }

        for (int n : count) {
            System.out.println(n);
        }
    }
}