import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int truemin = min - 45;

        if (truemin < 0) {
            truemin += 60;
            hour = (hour + 23) % 24;
        }

        System.out.println(hour + " " + truemin);
    }
}
