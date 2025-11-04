import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            int room = (1 + N / H);
            
            if( N%H == 0) {
            	System.out.printf("%d%02d\n",H,room-1);
            }else {
            	System.out.printf("%d%02d\n",N%H,room);
            }
        	
        }
    }
}
