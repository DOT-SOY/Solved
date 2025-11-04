import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        String str = (num1 * num2 * num3) + "";
        String[] strArr = str.split("");
        int[] intArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for(int i = 0; i < strArr.length; i++) {
        	intArr[Integer.parseInt(strArr[i])]++;
        }
        
        for (int n : intArr) {
            System.out.print(n + "\n");
        }
    }
}