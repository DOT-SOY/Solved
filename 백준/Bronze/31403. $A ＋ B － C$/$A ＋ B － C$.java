import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        
        String AnB = "" + numA + numB;
        
        int ans1 = numA + numB - numC;
        int ans2 = Integer.parseInt(AnB) - numC ;

        System.out.print(ans1+ "\n" + ans2);
    }
}